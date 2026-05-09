package com.codegnan.collectionsframework.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();

		// put()
		map.put(126, "Ramesh"); // Entry
		map.put(104, "Kumar"); // Entry
		map.put(33, "Sravani");// Entry
		map.put(543, "Rohini");// Entry
		map.put(43, "Kabitha");// Entry

		System.out.println(map);

		// keySet() - to retrieve all the keys
		System.out.println(map.keySet());

		// values() - to retrieve all the values
		System.out.println(map.values());

		// entrySet() - retrieves set of entries
		for (Entry<Integer, String> entry : map.entrySet()) {
			// to get the key and value of Entry
			System.out.println("Key: " + entry.getKey() + " " + "Value: " + entry.getValue());
		}

	}

}
