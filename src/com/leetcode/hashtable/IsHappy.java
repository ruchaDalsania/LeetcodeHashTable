package com.leetcode.hashtable;

public class IsHappy {

	public boolean isHappy(int n) {
		int i = 0;
		while (i < Integer.MAX_VALUE) {
			String s = String.valueOf(i == 0 ? Math.abs(n) : i);
			char[] cs = s.toCharArray();
			int temp = 0;
			for (char c : cs) {
				temp += Math.pow(Character.getNumericValue(c), 2);
			}
			i = temp;
			if (temp == 1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		IsHappy thisClass = new IsHappy();
		System.out.println(thisClass.isHappy(-19));

	}

}
