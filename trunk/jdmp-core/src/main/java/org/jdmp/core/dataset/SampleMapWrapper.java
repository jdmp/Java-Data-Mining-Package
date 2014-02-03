package org.jdmp.core.dataset;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.AbstractListModel;

import org.jdmp.core.sample.Sample;
import org.jdmp.core.sample.SampleFactory;
import org.jdmp.core.util.ObservableMap;
import org.ujmp.core.collections.map.SoftHashMap;
import org.ujmp.core.interfaces.Wrapper;
import org.ujmp.core.util.StringUtil;

public class SampleMapWrapper<V> extends AbstractListModel implements ObservableMap<Sample>,
		Wrapper<Map<? extends Object, V>> {
	private static final long serialVersionUID = -699242401200223218L;

	private Map<? extends Object, V> map = null;

	private Map<Sample, Integer> sampleToIndex = null;

	private Map<Integer, Sample> indexToSample = null;

	public SampleMapWrapper(Map<? extends Object, V> map) {
		this.map = map;
		sampleToIndex = new SoftHashMap<Sample, Integer>();
		indexToSample = new SoftHashMap<Integer, Sample>();
	}

	public synchronized void clear() {
		int size = map.size();
		sampleToIndex.clear();
		indexToSample.clear();
		map.clear();
		fireIntervalRemoved(this, 0, size - 1);
	}

	public Sample getElementAt(int index) {
		Sample sample = indexToSample.get(index);
		if (sample != null) {
			return sample;
		}
		int i = 0;
		for (Object k : map.keySet()) {
			if (i == index) {
				V v = map.get(k);
				Sample s = SampleFactory.createFromObject(v);
				s.setId(StringUtil.convert(k));
				indexToSample.put(i, s);
				sampleToIndex.put(s, i);
				return s;
			}
			i++;
		}
		return null;
	}

	public int indexOf(Sample value) {
		Integer index = sampleToIndex.get(value);
		if (index != null) {
			return index;
		}
		int i = 0;
		for (Object k : map.keySet()) {
			V v = map.get(k);
			if (value.equals(v)) {
				Sample s = SampleFactory.createFromObject(v);
				s.setId(StringUtil.convert(k));
				indexToSample.put(i, s);
				sampleToIndex.put(s, i);
				return i;
			}
			i++;
		}
		return -1;
	}

	public boolean isEmpty() {
		return map.isEmpty();
	}

	public Collection<Sample> toCollection() {
		throw new RuntimeException("not implemented");
	}

	public int getSize() {
		return map.size();
	}

	public Iterator<Sample> iterator() {
		return new Iterator<Sample>() {

			int index = 0;

			public boolean hasNext() {
				return index < map.size();
			}

			public Sample next() {
				return getElementAt(index++);
			}

			public void remove() {
				throw new RuntimeException("not implemented");
			}
		};
	}

	public Map<? extends Object, V> getWrappedObject() {
		return map;
	}

	public synchronized void setWrappedObject(Map<? extends Object, V> object) {
		int size = map.size();
		indexToSample.clear();
		sampleToIndex.clear();
		this.map = object;
		fireContentsChanged(this, 0, size - 1);
	}

	public synchronized void add(Sample value) {
		throw new RuntimeException("use put to add values");
	}

	public void addAll(Collection<Sample> values) {
		throw new RuntimeException("use put to add values");
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[ ");
		for (int i = 0; i < getSize(); i++) {
			s.append(getElementAt(i));
			if (i < getSize() - 1) {
				s.append(", ");
			}
		}
		s.append(" ]");
		return s.toString();
	}

	public void fireContentsChanged() {
		fireContentsChanged(this, -1, -1);
	}

	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	public Set<java.util.Map.Entry<String, Sample>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sample get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sample put(String key, Sample value) {
		// TODO Auto-generated method stub
		return null;
	}

	public void putAll(Map<? extends String, ? extends Sample> m) {
		// TODO Auto-generated method stub

	}

	public Sample remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Collection<Sample> values() {
		// TODO Auto-generated method stub
		return null;
	}

}
