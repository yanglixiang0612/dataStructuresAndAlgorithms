package com.itheima.sort;

import java.util.Arrays;

public class Test04_�����㷨֮ϣ������ {

	public static void main(String[] args) {
		int[] arr = new int[] {3,5,2,7,8,1,2,0,4,7,4,3,8};
		System.out.println("�Ƚ�ǰ��" + Arrays.toString(arr));
		shellSort(arr);
		System.out.println("�ȽϺ�" + Arrays.toString(arr));
	}

	private static void shellSort(int[] arr) {
		int k = 1;
		for (int d = arr.length/2; d>0; d/=2) {         //�������еĲ���
			for (int i = d; i < arr.length; i++) {     //�������е�Ԫ��
				if(arr[i] < arr[i-d]) {
					int temp = arr[i];
					int j;
					for (j = i-d; j >= 0 && temp<arr[j]; j-=d) {        //��������Ԫ��
						arr[j+d] = arr[j];
					}
					arr[j+d] = temp;
				}
				
			}
			
			System.out.println("��" + k + "����������" + Arrays.toString(arr));
			k++;
		}
	}

}
