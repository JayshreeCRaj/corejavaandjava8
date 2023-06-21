package com.corejava.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraverse {

	public static void main(String[] args) {
		
		Map map1 = new HashMap();
		map1.put(1,  "A");
		map1.put(2,  "B");
		map1.put(3, "C");
		map1.put(4, "D");
		map1.put(5, "E");
		map1.put(6, "F");
		
		Set set = map1.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object key = it.next();
			Object value = map1.get(key);
			System.out.println(key + ":" + value);
		}
	}

}
