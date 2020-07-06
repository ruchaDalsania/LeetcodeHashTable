package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FindRestaurant {

	public String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		for (int i = 0; i < list2.length; i++) {
			map2.put(list2[i], i);
		}
		int min = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (map2.containsKey(entry.getKey())) {
				int total = (entry.getValue() + map2.get(entry.getKey()));
				min = total < min ? total : min;
			}
		}
		//TODO
		return list1;
	}

	public static void main(String[] args) {
		FindRestaurant thisClass = new FindRestaurant();
		String[] s1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String s2[] = { "KFC", "Shogun", "Burger King" };
		System.out.println(thisClass.findRestaurant(s1, s2));

	}

}
