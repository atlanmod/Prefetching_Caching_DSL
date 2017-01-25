package fr.inria.atlanmod.prefetchml.core.processor.emf;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.inria.atlanmod.prefetchml.core.PrefetchCore;

public class EventNotifierDelegateEList<E> implements EList<E> {

	private PrefetchCore pCore;
	private List<E> list;
	
	public EventNotifierDelegateEList(List<E> theList, PrefetchCore core) {
		this.list = theList;
		this.pCore = core;
	}
	
	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public boolean contains(Object o) {
		return list.contains(o);
	}

	public Iterator<E> iterator() {
		return new EIterator<E>();
	}

	  /**
	   * An extensible iterator implementation.
	   */
	  protected class EIterator<E1> implements Iterator<E1>
	  {
	    /**
	     * The current position of the iterator.
	     */
	    protected int cursor = 0;

	    /**
	     * The previous position of the iterator.
	     */
	    protected int lastCursor = -1;

	    /**
	     * The modification count of the containing list.
	     */
//	    protected int expectedModCount = modCount;

	    /**
	     * Returns whether there are more objects.
	     * @return whether there are more objects.
	     */
	    public boolean hasNext()
	    {
	      return cursor != size();
	    }

	    /**
	     * Returns the next object and advances the iterator.
	     * This implementation delegates to {@link #doNext doNext}.
	     * @return the next object.
	     * @exception NoSuchElementException if the iterator is done.
	     */
	    @SuppressWarnings("unchecked")
	    public E1 next()
	    {
	      return (E1)doNext();
	    }

	    /**
	     * Returns the next object and advances the iterator.
	     * This implementation delegates to {@link AbstractEList#get get}.
	     * @return the next object.
	     * @exception NoSuchElementException if the iterator is done.
	     */
	    protected E doNext()
	    {
	      try
	      {
	        E next = get(cursor);
	        checkModCount();
	        lastCursor = cursor++;
	        return next;
	      }
	      catch (IndexOutOfBoundsException exception)
	      {
	        checkModCount();
	        throw new NoSuchElementException();
	      }
	    }

	    /**
	     * Removes the last object returned by {@link #next()} from the list,
	     * it's an optional operation.
	     * This implementation can also function in a list iterator
	     * to act upon on the object returned by calling <code>previous</code>.
	     * @exception IllegalStateException
	     * if <code>next</code> has not yet been called,
	     * or <code>remove</code> has already been called after the last call to <code>next</code>.
	     */
	    public void remove()
	    {
	      if (lastCursor == -1)
	      {
	        throw new IllegalStateException();
	      }
	      checkModCount();

	      try
	      {
	        EventNotifierDelegateEList.this.remove(lastCursor);
//	        expectedModCount = modCount;
	        if (lastCursor < cursor)
	        {
	          --cursor;
	        }
	        lastCursor = -1;
	      }
	      catch (IndexOutOfBoundsException exception)
	      {
	        throw new ConcurrentModificationException();
	      }
	    }

	    /**
	     * Checks that the modification count is as expected.
	     * @exception ConcurrentModificationException if the modification count is not as expected.
	     */
	    protected void checkModCount()
	    {
//	      if (modCount != expectedModCount)
//	      {
//	        throw new ConcurrentModificationException();
//	      }
	    }
	  }

	public Object[] toArray() {
		return list.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return list.toArray(a);
	}

	public boolean add(E e) {
		return list.add(e);
	}

	public boolean remove(Object o) {
		return list.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}

	public boolean addAll(Collection<? extends E> c) {
		return list.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		return list.addAll(c);
	}

	public boolean removeAll(Collection<?> c) {
		return list.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return list.retainAll(c);
	}

	public void clear() {
		list.clear();
	}

	public E get(int index) {
		// Problem 2, what is this list field about ?
		// The problem is here : in the cache access ? 
		E result =  (E)list.get(index);
		pCore.getEventAPI().accessEvent((EObject)result);
		return result;
	}

	public E set(int index, E element) {
		return list.set(index, element);
	}

	public void add(int index, E element) {
		list.add(index,element);
	}

	public E remove(int index) {
		return list.remove(index);
	}

	public int indexOf(Object o) {
		return list.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return list.lastIndexOf(o);
	}

	public ListIterator<E> listIterator() {
		return list.listIterator();
	}

	public ListIterator<E> listIterator(int index) {
		return list.listIterator(index);
	}

	public List<E> subList(int fromIndex, int toIndex) {
		return list.subList(fromIndex, toIndex);
	}

	// TODO
	public void move(int newPosition, E object) {
//		list.move(newPosition, object);
	}

	public E move(int newPosition, int oldPosition) {
		return null;
//		return list.move(newPosition, oldPosition);
	}

}
