package com.leetcode.hashtable;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersection {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
		Set<Integer> s2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
		s2.retainAll(s1);
		int[] output = new int[s2.size()];
		int idx = 0;
		for (int s : s2)
			output[idx++] = s;
		return output;
	}

	public static void main(String[] args) {
		Intersection thisClass = new Intersection();
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		System.out.println(Arrays.toString(nums1) + "\n" + Arrays.toString(nums2) + "\n"
				+ Arrays.toString(thisClass.intersection(nums1, nums2)));
	}

}
