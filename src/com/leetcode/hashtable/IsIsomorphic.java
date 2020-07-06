package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				if (!map.containsValue(t.charAt(i))) {
					map.put(s.charAt(i), t.charAt(i));
				} else {
					return false;
				}
			} else {
				if (t.charAt(i) != map.get(s.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsIsomorphic thisClass = new IsIsomorphic();
		System.out.println(thisClass.isIsomorphic("food", "rggg"));

	}

}
