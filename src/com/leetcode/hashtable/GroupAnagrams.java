package com.leetcode.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
//			char[] a1 = s.toCharArray();
//			Arrays.sort(a1);
//			String sorted = String.valueOf(a1);
			char[] ca = new char[26];
			for (char c : s.toCharArray()) {
				ca[c - 'a']++;
			}
			String sorted = String.valueOf(ca);
			if (!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<String>());
			}
			map.get(sorted).add(s);

		}
		return new ArrayList<List<String>>(map.values());
	}

	public static void main(String[] args) {
		GroupAnagrams thisClass = new GroupAnagrams();
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(thisClass.groupAnagrams(strs));

	}

}
