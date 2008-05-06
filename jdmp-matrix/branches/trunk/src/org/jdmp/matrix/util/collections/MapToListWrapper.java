package org.jdmp.matrix.util.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jdmp.matrix.interfaces.Wrapper;

public class MapToListWrapper<A> implements Wrapper<Map<Integer, A>>, List<A> {

	private static final Logger logger = Logger.getLogger(MapToListWrapper.class.getName());

	private Map<Integer, A> map = null;

	private int pos = 0;

	private int start = 0;

	public MapToListWrapper(Map<Integer, A> map) {
		this.map = map;
		start = 0;
		pos = map.size();
	}

	public boolean add(A e) {
		map.put(pos++, e);
		return true;
	}

	public void add(int index, A element) {
		logger.log(Level.WARNING, "not implemented");
	}

	public boolean addAll(Collection<? extends A> c) {
		for (A a : c) {
			add(a);
		}
		return true;
	}

	public boolean addAll(int index, Collection<? extends A> c) {
		logger.log(Level.WARNING, "not implemented");
		return false;
	}

	public void clear() {
		start = 0;
		pos = 0;
		map.clear();
	}

	public boolean contains(Object o) {
		return map.containsValue(o);
	}

	public boolean containsAll(Collection<?> c) {
		logger.log(Level.WARNING, "not implemented");
		return false;
	}

	public A get(int index) {
		return map.get(start + index);
	}

	public int indexOf(Object o) {
		logger.log(Level.WARNING, "not implemented");
		return 0;
	}

	public boolean isEmpty() {
		return map.isEmpty();
	}

	public Iterator<A> iterator() {
		return map.values().iterator();
	}

	public int lastIndexOf(Object o) {
		logger.log(Level.WARNING, "not implemented");
		return 0;
	}

	public ListIterator<A> listIterator() {
		logger.log(Level.WARNING, "not implemented");
		return null;
	}

	public ListIterator<A> listIterator(int index) {
		logger.log(Level.WARNING, "not implemented");
		return null;
	}

	public boolean remove(Object o) {
		logger.log(Level.WARNING, "not implemented");
		return false;
	}

	public A remove(int index) {
		if (index == 0) {
			map.remove(start);
			start++;
		} else {
			logger.log(Level.WARNING, "not implemented");
		}
		return null;
	}

	public boolean removeAll(Collection<?> c) {
		logger.log(Level.WARNING, "not implemented");
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		logger.log(Level.WARNING, "not implemented");
		return false;
	}

	public A set(int index, A element) {
		map.put(start + index, element);
		return null;
	}

	public int size() {
		return map.size();
	}

	public List<A> subList(int fromIndex, int toIndex) {
		logger.log(Level.WARNING, "not implemented");
		return null;
	}

	public Object[] toArray() {
		logger.log(Level.WARNING, "not implemented");
		return null;
	}

	public <T> T[] toArray(T[] a) {
		logger.log(Level.WARNING, "not implemented");
		return null;
	}

	public Map<Integer, A> getWrappedObject() {
		return map;
	}

	public void setWrappedObject(Map<Integer, A> object) {
		this.map = object;
	}

}
