package com.itheima.test1;

import java.util.Arrays;

public class Test03_����Ԫ�ص�ɾ�� {
	
	//���ɾ�������е�Ԫ��
	public static void main(String[] args) {
		//Ŀ������
		int[] arr = new int[] {9,8,7,6,5,4};
		System.out.println(Arrays.toString(arr));
		//Ҫɾ����Ԫ�ص��±�
		int dst = 1;
		//����һ���µ����飬������ԭ���鳤��-1
		int[] newArr = new int[arr.length - 1];
		//����ԭ�����г���Ҫɾ�����Ǹ�Ԫ������������Ԫ��
		for (int i = 0; i < newArr.length; i++) {
			//Ҫɾ����Ԫ��֮ǰ��Ԫ��
			if(i<dst) {
				newArr[i] = arr[i];
			}else {                         //Ҫɾ����Ԫ��֮���Ԫ��
				newArr[i] = arr[i + 1];
			}
		}
		//�������滻������
		arr = newArr;
		System.out.println(Arrays.toString(arr));
		
	}

}
