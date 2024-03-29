package com.learn.algorithm.sort;

public class Selectoin<T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		int N = nums.length;
		for(int i = 0; i < N - 1; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if(less(nums[j], nums[i])) {
					min = j;
				}
			}
			swap(nums, i, min);
		}
	}

}
