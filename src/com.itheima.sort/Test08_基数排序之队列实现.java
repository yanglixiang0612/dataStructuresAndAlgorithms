package com.itheima.sort;

import java.util.Arrays;

import com.itheima.test1.MyQueue;

public class Test08_��������֮����ʵ�� {

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
		MyQueue[] temp = new MyQueue[10];                    //������ʱ�洢���ݵĶ��е�����
		for (int i = 0; i < temp.length; i++) {
			temp[i] = new MyQueue();                         //Ϊ�������鸳ֵ
		}
		for (int i = 0,n = 1; i < maxLength; i++,n*=10) {    //������󳤶ȵ��������ȽϵĴ���
			for (int j = 0; j < arr.length; j++) {
				int ys = arr[j]/n%10;                        //��������
				temp[ys].add(arr[j]);                        //�ѵ�ǰ���������ݴ���ָ���Ķ�����
			}
			int index = 0;                                   //��¼ȡ��Ԫ����Ҫ�ŵ�λ��
			for (int k = 0; k < temp.length; k++) {          //�����ж����е�����ȡ����
				while(!temp[k].isEmpty()) {                  //��ǰ�����Ķ��в�Ϊ��
					arr[index] = temp[k].poll();             //ȡ��Ԫ��
					index++;                                 //��¼��һ��λ��
				}
			}
		}
	}

}
