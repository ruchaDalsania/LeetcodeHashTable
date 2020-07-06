package com.leetcode.hashtable;

import java.util.Arrays;

public class MyHashMap {

	int[] list;

	/** Initialize your data structure here. */
	public MyHashMap() {
		list = new int[1000000];

	}

	public void put(int key, int value) {

		list[key] = value + 1;
	}

	public int get(int key) {

		return list[key] - 1;
	}

	public void remove(int key) {
		list[key] = 0;
	}

	public static void main(String[] args) {
		MyHashMap hashMap = new MyHashMap();
//		hashMap.put(1, 1);          
		hashMap.put(2, 2);
		System.out.println(hashMap.get(1));
		// returns 1
//		System.out.println(hashMap.get(3));            // returns -1 (not found)
//		hashMap.put(2, 1);          // update the existing value
//		System.out.println(hashMap.get(2));            // returns 1 
//		hashMap.remove(2);          // remove the mapping for 2
//		System.out.println(hashMap.get(2));            // returns -1 (not found) 
	}
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj
 * = new MyHashSet(); obj.add(key); obj.remove(key); boolean param_3 =
 * obj.contains(key);
 */