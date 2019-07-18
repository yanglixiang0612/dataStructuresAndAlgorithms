package com.itheima.sort;

import java.util.Arrays;

public class Test01_≈≈–ÚÀ„∑®÷Æ√∞≈›≈≈–Ú {

	public static void main(String[] args) {
		int[] arr = new int[] {2,1,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		int count = 0;
		boolean change = true;                     //Ã·«∞÷’÷π≈≈–Ú
		for (int i = 0; change&&i < arr.length - 1; i++) {
			change = false;
			count++;
			System.out.println(count);
			System.out.println("1111111111111");
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					change = true;
				}
			}
		}
	}
	

}
