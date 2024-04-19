package com.always.mensaje;

import java.util.Comparator;
import java.util.Map;

public class MapComparator implements Comparator{
	Map m;

	public MapComparator(Map m) {

		this.m = m;
	}
	
	public int compare(Object o1, Object o2) {
		return((Integer) m.get(o2)).compareTo((Integer) m.get(o1));
	}
}
