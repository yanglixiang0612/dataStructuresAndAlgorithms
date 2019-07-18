package com.itheima.sort;

import java.util.Arrays;

public class Test07_�����㷨֮�������� {

	public static void main(String[] args) {
		int[] arr = new int[] {23,6,189,45,9,287,56,1,789,34,65,652,5};
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void radixSort(int[] arr) {
		int max = Integer.MIN_VALUE;                         //��������������
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		int maxLength = (max + "").length();                 //������������Ǽ�λ��
		int[][] temp = new int[10][arr.length];              //������ʱ�洢���ݵ�����
		int[] counts = new int[10];                          //���ڼ�¼��temp����Ӧ�������д�ŵ����ֵ�����
		for (int i = 0,n = 1; i < maxLength; i++,n*=10) {    //������󳤶ȵ��������ȽϵĴ���
			for (int j = 0; j < arr.length; j++) {
				int ys = arr[j]/n%10;                        //��������
				temp[ys][counts[ys]] = arr[j];               //�ѵ�ǰ���������ݴ���ָ����������
				counts[ys]++;                                //��¼����
			}
			int index = 0;                                   //��¼ȡ��Ԫ����Ҫ�ŵ�λ��
			for (int k = 0; k < counts.length; k++) {        //������ȡ����
				if(counts[k] != 0) {                         //��ǰ������¼��������Ϊ0
					for (int l = 0; l < counts[k]; l++) {    //ѭ��ȡ��Ԫ��
						arr[index] = temp[k][l];             //ȡ��Ԫ��
						index++;                             //��¼��һ��λ��
					}
					counts[k] = 0;                           //��������Ϊ0
				}
			}
		}
	}

}
