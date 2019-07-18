package com.itheima.sort;

import java.util.Arrays;

public class Test05_排序算法之选择排序 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,7,1,2,0,3,6,8};
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	//选择排序
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {    //把当前遍历的数和后面所有的数依次进行比较
				if(arr[minIndex] > arr[j]) {
					minIndex = j;                 //记录下最小的那个数的下标
				}
			}
			if(i != minIndex) {   //如果最小的数和当前遍历的数下标不一致，说明下标为minIndex的数比当前遍历的数更小
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
