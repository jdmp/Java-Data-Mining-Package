package org.jdmp.ehcache;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.Map;

import org.ujmp.core.Matrix;
import org.ujmp.core.coordinates.Coordinates;
import org.ujmp.core.genericmatrix.AbstractMapToTiledMatrix2DWrapper;
import org.ujmp.core.objectmatrix.ObjectMatrix2D;

public class TiledEhcacheMatrix2D<A> extends AbstractMapToTiledMatrix2DWrapper<A> {
	private static final long serialVersionUID = 4324063544046176423L;

	private transient Map<Coordinates, ObjectMatrix2D> values = null;

	public TiledEhcacheMatrix2D(long... size) {
		super(size);
	}

	public TiledEhcacheMatrix2D(Matrix source) {
		super(source);
	}

	@Override
	public Map<Coordinates, ObjectMatrix2D> getMap() {
		if (values == null) {
			try {
				values = new EhcacheMap<Coordinates, ObjectMatrix2D>();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return values;
	}

	@Override
	public void setMap(Map<Coordinates, ObjectMatrix2D> map) {
		this.values = map;
	}

	private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();
		for (long[] c : availableCoordinates()) {
			s.writeObject(c);
			s.writeObject(getObject(c));
		}
	}

	private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
		s.defaultReadObject();
		while (true) {
			try {
				long[] c = (long[]) s.readObject();
				Object o = s.readObject();
				setObject(o, c);
			} catch (OptionalDataException e) {
				return;
			}
		}
	}

}
