package com.template.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {
	public static void main(String[] args) {
		MapExamples.hashMapImpl();
		MapExamples.linkedHashMapImpl();
	}

	static void hashMapImpl() {
		System.out.println("HashMap");
		Map<String, String> cars = new HashMap<String, String>();

		cars.put("Tata", "Nexon");
		cars.put("Suzuki", "Swift");

		System.out.println(cars);

		Set<String> keys = cars.keySet();
		System.out.println(keys);
	}
	
	static void linkedHashMapImpl() {
		System.out.println("Linked HashMap");
		Map<String, Integer> capacity = new LinkedHashMap<String, Integer>();
		
		capacity.put("Nexon", 4);
		capacity.put("Swift", 4);
		
		System.out.println(capacity);
		
		Set<String> keys = capacity.keySet();
		System.out.println(keys);
	}
}
