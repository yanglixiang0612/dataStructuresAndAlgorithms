package com.itheima.sort;

import java.util.Arrays;

public class Test02_排序算法之快速排序 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,6,7,2,7,2,8,0,9,10};
		quickSort(arr,0,arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			int stard = arr[start];        		  //把数组中的第0个数作为标准数
			int low = start;
			int high = end;            			  //记录需要排序的下标
			while(low < high) {                   //循环找比标准数大的数和比标准数小的数
				while(low<high&&stard<=arr[high]) {          //右边的数比标准数大
					high--;
				}
				arr[low] = arr[high];         //使用右边的数字替换左边的数
				
				while(low<high&&stard>=arr[low]) {     //如果左边的数字比标准数小
					low++;
				}
				arr[high] = arr[low];
			}
			
			arr[low] = stard;        //把标准数赋给低所在的位置的元素
			
			quickSort(arr, start, low);        //处理所有的小的数字
			quickSort(arr, low+1, end);        //处理所有的大的数字
		}
		
	}

}
