package com.itheima.sort;

import java.util.Arrays;

public class Test03_排序算法之插入排序 {

	public static void main(String[] args) {
		int[] arr = new int[] {5,3,2,8,5,9,1,0,5,6,7,1};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	//插入排序
	public static void insertSort(int[] arr) {
		//遍历所有的元素
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[i-1]) {      //如果当前数字比前一个数字小
				int temp = arr[i];     //把当前遍历数字存起来
				int j;
				for(j=i-1;j>=0&&temp<arr[j];j--) {   //遍历当前数字前面所有的数字
					arr[j+1] = arr[j];     //把前一个数字赋给后一个数字
				}
				arr[j+1] = temp;         //把临时变量（外层for循环的当前元素）赋给不满足条件的后一个元素
			}
			/*for (int j = i-1; j>=0; j--) {    //[0, 1, 1, 2, 3, 5, 5, 5, 6, 7, 8, 9]
				if(arr[j]>arr[j+1]) {           //[0, 1, 1, 2, 3, 5, 5, 5, 6, 7, 8, 9]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}*/
		}
	}

}
