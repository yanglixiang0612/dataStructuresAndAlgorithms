package com.itheima.sort;

import java.util.Arrays;

public class Test02_�����㷨֮�������� {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,6,7,2,7,2,8,0,9,10};
		quickSort(arr,0,arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			int stard = arr[start];        		  //�������еĵ�0������Ϊ��׼��
			int low = start;
			int high = end;            			  //��¼��Ҫ������±�
			while(low < high) {                   //ѭ���ұȱ�׼��������ͱȱ�׼��С����
				while(low<high&&stard<=arr[high]) {          //�ұߵ����ȱ�׼����
					high--;
				}
				arr[low] = arr[high];         //ʹ���ұߵ������滻��ߵ���
				
				while(low<high&&stard>=arr[low]) {     //�����ߵ����ֱȱ�׼��С
					low++;
				}
				arr[high] = arr[low];
			}
			
			arr[low] = stard;        //�ѱ�׼�����������ڵ�λ�õ�Ԫ��
			
			quickSort(arr, start, low);        //�������е�С������
			quickSort(arr, low+1, end);        //�������еĴ������
		}
		
	}

}
