package com.itheima.test1;

public class Test06_���ַ����� {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};   //Ŀ������
		int target = 1;        //Ŀ��Ԫ��
		int begin = 0;         //��¼��ʼλ��
		int end = arr.length - 1;  //��¼����λ��
		int mid = (begin + end)/2;   //��¼�м�λ��
		int index = -1;      //��¼Ŀ��λ��
		while(true) {           //ѭ������
			if(begin > end) {
				return;
			}
			if(arr[mid] == target) {         //�ж��м�����Ԫ���ǲ���Ҫ���ҵ�Ԫ��
				index = mid;
				break;
			}else {                 //�м�����Ԫ�ز���Ҫ���ҵ�Ԫ��
				if(arr[mid] > target) {
					end = mid - 1;
				}else {
					begin = mid + 1;
				}
				mid = (begin + end)/2;
			}
		}
		System.out.println("index:" + index);
		
	}

}
