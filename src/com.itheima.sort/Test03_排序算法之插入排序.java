package com.itheima.sort;

import java.util.Arrays;

public class Test03_�����㷨֮�������� {

	public static void main(String[] args) {
		int[] arr = new int[] {5,3,2,8,5,9,1,0,5,6,7,1};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	//��������
	public static void insertSort(int[] arr) {
		//�������е�Ԫ��
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[i-1]) {      //�����ǰ���ֱ�ǰһ������С
				int temp = arr[i];     //�ѵ�ǰ�������ִ�����
				int j;
				for(j=i-1;j>=0&&temp<arr[j];j--) {   //������ǰ����ǰ�����е�����
					arr[j+1] = arr[j];     //��ǰһ�����ָ�����һ������
				}
				arr[j+1] = temp;         //����ʱ���������forѭ���ĵ�ǰԪ�أ����������������ĺ�һ��Ԫ��
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
