package com.itheima.test1;

import java.util.Arrays;

class Test02_����Ԫ�ص���� {
	
	//������鳤�Ȳ��ɱ������
	public static void main(String[] args) {
		int[] arr = new int[] {9,8,7};
		//���ٲ鿴�����е�Ԫ��
		System.out.println(Arrays.toString(arr));
		//Ҫ���������Ŀ��Ԫ��
		int dst = 6;
		//����һ���µ����飬������ԭ���鳤��+1
		int[] newArr = new int[arr.length + 1];
		//��ԭ�����е�����ȫ�����Ƶ���������
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		//��Ŀ��Ԫ�ط�������������
		newArr[newArr.length - 1] = dst;
		//�������滻ԭ����
		arr = newArr;
		System.out.println(Arrays.toString(arr));
	}

}
