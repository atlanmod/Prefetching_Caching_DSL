package fr.inria.atlanmod.prefetchml.core.processor.emf;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.PrefetchCore;
import fr.inria.atlanmod.prefetchml.core.cache.EMFIndexedCacheKey;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;
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
	    String id = IDUtil.getURIFragment(owner);
		EMFIndexedCacheKey sizeKey = new EMFIndexedCacheKey(id,feature,-2);
		MonitoredCacheValue cachedSize = pCore.getActiveCache().get(sizeKey);
		if(cachedSize != null) {
		    pCore.hit();
		    return (int)cachedSize.value();
		}
		else {
		    int theSize = delegateEGet().size();
		    pCore.getActiveCache().put(sizeKey, new MonitoredCacheValue(theSize, null));
		    pCore.miss();
		    return theSize;
		}
	}

	public boolean isEmpty() {
	    PrefetchMLLogger.debug("IsEmpty");
		return delegateEGet().isEmpty();
	}

	public boolean contains(Object o) {
	    PrefetchMLLogger.debug("Contains");
		return delegateEGet().contains(o);
	}

	public Iterator<E> iterator() {
	    PrefetchMLLogger.debug("Iterator");
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
	    
	    protected int size = -1;

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
	        if(size == -1) {
	            size = size();
	        }
	      return cursor != size;
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
	    PrefetchMLLogger.debug("ToArray");
		return delegateEGet().toArray();
	}

	public <T> T[] toArray(T[] a) {
	    PrefetchMLLogger.debug("ToArray");
		return delegateEGet().toArray(a);
	}

	public boolean add(E e) {
	    PrefetchMLLogger.debug("Add");
		return delegateEGet().add(e);
	}

	public boolean remove(Object o) {
	    PrefetchMLLogger.info("Remove");
		return delegateEGet().remove(o);
	}

	public boolean containsAll(Collection<?> c) {
	    PrefetchMLLogger.debug("ContainsAll");
		return delegateEGet().containsAll(c);
	}

	public boolean addAll(Collection<? extends E> c) {
	    PrefetchMLLogger.debug("AddAll");
	    /*
	     * Register an add event to ensure cache consistency
	     */
	    pCore.getEventAPI().addEvent(owner, feature, c.size());
		return delegateEGet().addAll(c);
	}

	public boolean addAll(int index, Collection<? extends E> c) {
	    PrefetchMLLogger.debug("AddAll");
	    /*
	     * Register an add event to ensure cache consistency
	     */
	    pCore.getEventAPI().addEvent(owner, feature, c.size());
	    PrefetchMLLogger.warn("addAll at a given index are not supported, cache may be inconsistent");
		return delegateEGet().addAll(c);
	}

	public boolean removeAll(Collection<?> c) {
	    PrefetchMLLogger.debug("RemoveAll");
	    /*
	     * Register a remove event to ensure cache consistency
	     */
	    PrefetchMLLogger.warn("addAll at a given index are not supported, cache may be inconsistent");
		return delegateEGet().removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
	    PrefetchMLLogger.debug("RetainAll");
		return delegateEGet().retainAll(c);
	}

	public void clear() {
	    PrefetchMLLogger.debug("Clear");
		delegateEGet().clear();
	}

	@SuppressWarnings("unchecked")
    public E get(int index) {
	    Object result = null;
		if(owner != null && feature != null) {
		    String id = IDUtil.getURIFragment(owner);
			EMFIndexedCacheKey cacheKey = new EMFIndexedCacheKey(id, feature, index);
	    	MonitoredCacheValue cachedValue = pCore.getActiveCache().get(cacheKey);
	    	if(cachedValue != null) {
    	        pCore.hit();
    	        pCore.getEventAPI().accessEvent((EObject)cachedValue.value());
    	        E returnValue = (E)cachedValue.value();
    	        if(pCore.isMirrored()) {
    	            if(returnValue instanceof CDOObject) {
    	                CDOObject cdoObject = (CDOObject)returnValue;
    	                if(((CDOResource)pCore.getBaseResource()).cdoView().equals(cdoObject.cdoView())) {
    	                    returnValue = (E)cdoObject;
    	                }
    	                else {
    	                    returnValue = (E)pCore.getBaseResource().getEObject(IDUtil.getURIFragment((EObject)returnValue));
    	                }
    	            }
    	        }
    	        if(returnValue instanceof CDOObject) {
//    	            System.out.println("delegatelist view: " + ((CDOObject)returnValue).cdoView());
    	        }
    	        return returnValue;
//    	        return (E)cachedValue.value();
	    	}
	    	else {
	    	    Object theObject = delegateEGet().get(index);
	    	    pCore.getActiveCache().put(cacheKey, new MonitoredCacheValue(theObject, null));
	    	    pCore.getEventAPI().accessEvent((EObject)theObject);
	    	    pCore.miss();
	    	    if(theObject instanceof CDOObject) {
//	    	        System.out.println("delegateget view: " + ((CDOObject)theObject).cdoView());
	    	    }
	    	    return (E)theObject;
	    	}
		}
		else {
			// This is not a miss, null owner and feature means that the EList is 
			// an allInstance result
		    t++;
			result = delegateEGet().get(index);
			pCore.getEventAPI().accessEvent((EObject)result);
			return (E)result;
		}
	}
	
	public static int t = 0;
	
	public E set(int index, E element) {
	    PrefetchMLLogger.debug("Set");
	    /*
	     * Register an update event to ensure cache consistency
	     */
	    pCore.getEventAPI().updateEvent(owner, feature, index);
		return delegateEGet().set(index, element);
	}

	public void add(int index, E element) {
	    PrefetchMLLogger.debug("Add");
	    /*
	     * Register an add event to ensure cache consistency
	     */
	    pCore.getEventAPI().addEvent(owner, feature);
		delegateEGet().add(index,element);
	}

	public E remove(int index) {
	    PrefetchMLLogger.debug("Remove");
	    /*
	     * Register a remove event to ensure cache consistency
	     */
	    pCore.getEventAPI().removeEvent(owner, feature);
		return delegateEGet().remove(index);
	}

	public int indexOf(Object o) {
	    PrefetchMLLogger.debug("IndexOf");
		return delegateEGet().indexOf(o);
	}

	public int lastIndexOf(Object o) {
	    PrefetchMLLogger.debug("LastIndexOf");
		return delegateEGet().lastIndexOf(o);
	}

	public ListIterator<E> listIterator() {
	    PrefetchMLLogger.debug("ListIterator");
		return delegateEGet().listIterator();
	}

	public ListIterator<E> listIterator(int index) {
	    PrefetchMLLogger.debug("ListIterator");
		return delegateEGet().listIterator(index);
	}

	public List<E> subList(int fromIndex, int toIndex) {
	    PrefetchMLLogger.debug("SubList");
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
