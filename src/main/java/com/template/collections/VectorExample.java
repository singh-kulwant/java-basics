package com.template.collections;

import java.util.Hashtable;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		VectorExample.collectionBeforeFramework();
	}
	
	private static void collectionBeforeFramework() {
		
		int array[] = new int[] {1,2,3,4};
		
		Vector<Integer> vector = new Vector();
		vector.add(1);
		vector.add(2);
		
		Hashtable<Integer, String> hashtable = new Hashtable();
		hashtable.put(1, "One");
		hashtable.put(2, "Two");
		
		System.out.println(array[1]);
		System.out.println(vector.elementAt(1));
		System.out.println(hashtable.get(2));
	}
}
