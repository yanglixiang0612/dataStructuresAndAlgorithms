package com.itheima.test1;

import java.util.Arrays;

//������������
public class MyArray {                              
	//���ڴ洢���ݵ�����
	private int[] elements;
	public MyArray() {
		elements = new int[0];
	}
	
	public int size() {                                //��ȡ���鳤�ȵķ���
		return elements.length;
	}
	
	   
	public void add(int element) {                     //������ĩβ���һ��Ԫ��
		int[] newArr = new int[elements.length + 1];   //����һ���µ�����
		for (int i = 0; i < elements.length; i++) {    //��ԭ�����е�Ԫ�ظ��Ƶ���������
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;             //����ӵ�Ԫ�ط�����������
		elements = newArr;                             //ʹ���������滻������
	}
	
	public void show() {                               //��ӡ����Ԫ�ص�����̨
		System.out.println(Arrays.toString(elements));
	} 
	
	public void delete(int index) {                    //ɾ�������е�Ԫ��
		if(index < 0 || index > elements.length - 1) { //�ж��±��Ƿ�Խ��
			throw new RuntimeException("�±�Խ��");
		}
		int[] newArr = new int[elements.length - 1];   //����һ���µ����飬����Ϊԭ����ĳ���-1
		for (int i = 0; i < newArr.length; i++) {      //����ԭ�����ݵ�������
			if(i < index) {                            //��Ҫɾ����Ԫ��ǰ���Ԫ��
				newArr[i] = elements[i];
			}else {                                    //��Ҫɾ����Ԫ�غ����Ԫ��
				newArr[i] = elements[i + 1];
			}
		}
		elements = newArr;                             //�������滻������
	}
	
	public int get(int index) {                        //ȡ��ָ��λ�õ�Ԫ��
		if(index < 0 || index > elements.length - 1) { //�ж��±��Ƿ�Խ��
			throw new RuntimeException("�±�Խ��");
		}
		return elements[index];
	}
	
	public void insert(int index,int element) {        //����һ��Ԫ�ص�ָ��λ��
		int[] newArr = new int[elements.length + 1];   //����һ��������
		for (int i = 0; i < elements.length; i++) {    //��ԭ�����е�Ԫ�ط�����������
			if(i < index) {                            //Ŀ��λ��֮ǰ��Ԫ��
				newArr[i] = elements[i];
			}else {                                    //Ŀ��λ��֮���Ԫ��  
				newArr[i + 1] = elements[i];
			}
		}
		newArr[index] = element;                      //�����µ�Ԫ��
		elements = newArr;                            //�������滻������
	}
	
	public void set(int index,int element) {          //�滻ָ��λ�õ�Ԫ��
		if(index < 0 || index > elements.length - 1) { //�ж��±��Ƿ�Խ��
			throw new RuntimeException("�±�Խ��");
		}
		elements[index] = element;
	}
	
	//���Բ���
	public int search(int target) {
		for (int i = 0; i < elements.length; i++) {     //��������
			if(elements[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	//���ֲ���
	public int binarySearch(int target) {
		int begin = 0;         //��¼��ʼλ��
		int end = elements.length - 1;  //��¼����λ��
		int mid = (begin + end)/2;   //��¼�м�λ��
		while(true) {           //ѭ������
			if(begin > end) {
				return -1;
			}
			if(elements[mid] == target) {         //�ж��м�����Ԫ���ǲ���Ҫ���ҵ�Ԫ��
				return mid;
			}else {                 //�м�����Ԫ�ز���Ҫ���ҵ�Ԫ��
				if(elements[mid] > target) {
					end = mid - 1;
				}else {
					begin = mid + 1;
				}
				mid = (begin + end)/2;
			}
		}
	}
}
