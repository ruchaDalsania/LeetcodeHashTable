package com.leetcode.hashtable;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicate thisClass = new ContainsDuplicate();
		System.out.println("if the array contains any duplicates.");
		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(thisClass.containsDuplicate(nums) + " : " + Arrays.toString(nums));

	}

}
