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
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.PrefetchCore;
import fr.inria.atlanmod.prefetchml.core.cache.EMFIndexedCacheKey;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class DelegateEList<E> implements EList<E> {

	private EObject owner;
	private EStructuralFeature feature;
	private PrefetchCore pCore;
	
	private List<E> innerList;
	
	public DelegateEList(EObject owner, EStructuralFeature feature, PrefetchCore core) {
		this.owner = owner;
		this.feature = feature;
		if(!feature.isMany()) {
			PrefetchMLLogger.error("DelegateEList cannot be created with single valued feature");
		}
		this.pCore = core;
	}
	
	@SuppressWarnings("unchecked")
	protected List<E> delegateEGet() {
		if(innerList == null) {
			innerList = (List<E>)owner.eGet(feature);
		}
		return innerList;
	}
	
	public int size() {
		EMFIndexedCacheKey sizeKey = new EMFIndexedCacheKey(owner.eResource().getURIFragment(owner),feature,-2);
		if(pCore.getActiveCache().containsKey(sizeKey)) {
			return (int)pCore.getActiveCache().get(sizeKey);
		}
		else {
			return delegateEGet().size();
		}
	}

	public boolean isEmpty() {
		return delegateEGet().isEmpty();
	}

	public boolean contains(Object o) {
		return delegateEGet().contains(o);
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
	        DelegateEList.this.remove(lastCursor);
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
		return delegateEGet().toArray();
	}

	public <T> T[] toArray(T[] a) {
		return delegateEGet().toArray(a);
	}

	public boolean add(E e) {
		return delegateEGet().add(e);
	}

	public boolean remove(Object o) {
		return delegateEGet().remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return delegateEGet().containsAll(c);
	}

	public boolean addAll(Collection<? extends E> c) {
		return delegateEGet().addAll(c);
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		return delegateEGet().addAll(c);
	}

	public boolean removeAll(Collection<?> c) {
		return delegateEGet().removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return delegateEGet().retainAll(c);
	}

	public void clear() {
		delegateEGet().clear();
	}

	public E get(int index) {
		Object result = null;
		if(owner != null && feature != null) {
			EMFIndexedCacheKey cacheKey = new EMFIndexedCacheKey(owner.eResource().getURIFragment(owner), feature, index);
	    	if(pCore.getActiveCache().containsKey(cacheKey)) {
	    		result = pCore.getActiveCache().get(cacheKey);
	    		if(result != null) {
	    			pCore.hit();;
	    			pCore.getEventAPI().accessEvent((EObject)result);
	    			return (E)result;
	    		}
	    		else {
	    			pCore.miss();
	    			result = delegateEGet().get(index);
	    			pCore.getEventAPI().accessEvent((EObject)result);
	    			return (E)result;
	    		}
	    	}
	    	else {
	    		// The feature is not in the cache
	    		pCore.miss();
	    		Object r = delegateEGet().get(index);
	    		pCore.getEventAPI().accessEvent((EObject)r);
	    		return (E)r;
	    	}
		}
		else {
			// This is not a miss, null owner and feature means that the EList is 
			// an allInstance result
			result = delegateEGet().get(index);
			pCore.getEventAPI().accessEvent((EObject)result);
			return (E)result;
		}
	}
	
	public E set(int index, E element) {
		return delegateEGet().set(index, element);
	}

	public void add(int index, E element) {
		delegateEGet().add(index,element);
	}

	public E remove(int index) {
		return delegateEGet().remove(index);
	}

	public int indexOf(Object o) {
		return delegateEGet().indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return delegateEGet().lastIndexOf(o);
	}

	public ListIterator<E> listIterator() {
		return delegateEGet().listIterator();
	}

	public ListIterator<E> listIterator(int index) {
		return delegateEGet().listIterator(index);
	}

	public List<E> subList(int fromIndex, int toIndex) {
		return delegateEGet().subList(fromIndex, toIndex);
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
