package com.itheima.test1;

public class Test05_�����㷨֮���Բ��� {

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,5,6,8,4,9,0};   //Ŀ������
		int target = 5;                            //Ŀ��Ԫ��
		int index = -1;                            //Ŀ��Ԫ�����ڵ��±�
		for (int i = 0; i < arr.length; i++) {     //��������
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		System.out.println("index:" + index);      //��ӡĿ��Ԫ�ص��±�
		
	}

}
