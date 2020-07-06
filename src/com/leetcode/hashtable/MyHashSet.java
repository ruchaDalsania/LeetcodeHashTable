package com.leetcode.hashtable;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {

	List<List<Integer>> list;

	/** Initialize your data structure here. */
	public MyHashSet() {
		list = new ArrayList<>();
		for (int i = 0; i < 1000; i++)
			list.add(new ArrayList<Integer>());
	}

	private int hash(int key) {
		return key / 1000;
	}

	public void add(int key) {
		if (contains(key)) {
			return;
		}
		int hashIndex = hash(key);
		List<Integer> list2 = list.get(hashIndex);
		list2.add(key);

	}

	public void remove(int key) {
		int hashIndex = hash(key);
		List<Integer> list2 = list.get(hashIndex);
		if (list2.contains(key)) {
			list2.remove(Integer.valueOf(key));
		}
	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		int hashIndex = hash(key);
		List<Integer> list2 = list.get(hashIndex);
		if (null != list2 && list2.contains(key)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		MyHashSet obj = new MyHashSet();
		System.out.println(obj.contains(0));
		obj.add(1);
		System.out.println(obj.contains(1));
		obj.remove(1);
		System.out.println(obj.contains(1));
	}
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj
 * = new MyHashSet(); obj.add(key); obj.remove(key); boolean param_3 =
 * obj.contains(key);
 */