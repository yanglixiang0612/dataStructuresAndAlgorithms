package com.itheima.sort;

import java.util.Arrays;

public class Test04_排序算法之希尔排序 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,5,2,7,8,1,2,0,4,7,4,3,8};
		System.out.println("比较前：" + Arrays.toString(arr));
		shellSort(arr);
		System.out.println("比较后：" + Arrays.toString(arr));
	}

	private static void shellSort(int[] arr) {
		int k = 1;
		for (int d = arr.length/2; d>0; d/=2) {         //遍历所有的步长
			for (int i = d; i < arr.length; i++) {     //遍历所有的元素
				if(arr[i] < arr[i-d]) {
					int temp = arr[i];
					int j;
					for (j = i-d; j >= 0 && temp<arr[j]; j-=d) {        //遍历本组元素
						arr[j+d] = arr[j];
					}
					arr[j+d] = temp;
				}
				
			}
			
			System.out.println("第" + k + "次排序结果：" + Arrays.toString(arr));
			k++;
		}
	}

}
