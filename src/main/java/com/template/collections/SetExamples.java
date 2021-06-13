package com.template.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Doesn't allow duplicates
 * 
 * Unordered collection of objects
 * 
 * HashSet(Hashing based)
 * 
 * LinkedHashSet
 * 
 * TreeSet(balanced BST based, sorted) implements SortedSet
 * 
 * @author root
 *
 */
public class SetExamples {
	public static void main(String[] args) {
		SetExamples.hashSetImpl();
		SetExamples.linkedHashSetImpl();
		SetExamples.treeSetImpl();
	}

	static void hashSetImpl() {
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("India");
		hashSet.add("China");
		hashSet.add("Russia");
		hashSet.add("China");

		System.out.println("\nHashSet: \n-Removes duplicate\n-Unordered\n-Hashing based\n-Unsorted\n-Not synchronized");
		System.out.println(hashSet);

	}

	static void linkedHashSetImpl() {

		Set<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("India");
		linkedHashSet.add("China");
		linkedHashSet.add("Russia");
		linkedHashSet.add("China");

		System.out.println("\nLinkedHashSet: \n-Removes duplicate\n-Hashing based\n-Unsorted\n-Ordered\n-Not synchronized");
		System.out.println(linkedHashSet);
	}
	
	static void treeSetImpl() {
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("India");
		treeSet.add("China");
		treeSet.add("Russia");
		treeSet.add("China");

		System.out.println("\nTreeSet: \n-Removes duplicate\n-Sorted\n-Natural order\n-BST based\n-Not synchronzed");
		System.out.println(treeSet);
	}
}
