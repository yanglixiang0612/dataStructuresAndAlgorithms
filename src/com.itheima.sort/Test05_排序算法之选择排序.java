package com.itheima.sort;

import java.util.Arrays;

public class Test05_�����㷨֮ѡ������ {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,7,1,2,0,3,6,8};
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	//ѡ������
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {    //�ѵ�ǰ���������ͺ������е������ν��бȽ�
				if(arr[minIndex] > arr[j]) {
					minIndex = j;                 //��¼����С���Ǹ������±�
				}
			}
			if(i != minIndex) {   //�����С�����͵�ǰ���������±겻һ�£�˵���±�ΪminIndex�����ȵ�ǰ����������С
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
