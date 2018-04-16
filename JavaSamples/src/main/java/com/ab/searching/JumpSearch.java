package com.ab.searching;

public class JumpSearch {

	public static void main(String[] args) {

		int[] array = new int[20];
		int j = 0;
		while (j < 20) {
			array[j] = j;
			j++;
		}

		int x = 15;
		int length = array.length;
		search(array, 0, Double.valueOf(Math.sqrt(length)).intValue(), x);

	}

	static void search(int[] array, int start, int end, int x) {

		if (x < array[0] || x > array[array.length - 1]) {
			System.out.println(x + " doesn't exist in the given array");
			return;
		}

		while (x > array[end]) {
			start = end + 1;
			end = Double.valueOf(Math.sqrt(array.length)).intValue() + end > array.length - 1 ? array.length - 1
					: Double.valueOf(Math.sqrt(array.length)).intValue() + end;
		}
		for (int i = start; i <= end; i++) {
			if (x == array[i]) {
				System.out.println(x + " found at index: " + i + " in the given sorted array");
				return;
			}
		}
		System.out.println(x + " doesn't exist in the given array");
		return;
	}

}
