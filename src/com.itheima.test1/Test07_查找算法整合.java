package com.itheima.test1;

public class Test07_�����㷨���� {                                      //������MyArray.java��

	public static void main(String[] args) {
		MyArray ma = new MyArray();
		ma.add(20);
		ma.add(30);
		ma.add(40);
		ma.add(50);
		ma.add(60);
		ma.add(70);
		ma.add(80);
		ma.add(90);
		int index = ma.search(30);            //�������Բ��ҷ���
		System.out.println("index:" + index);
		
		int index2 = ma.binarySearch(10);     //���ö��ֲ��ҷ���
		System.out.println("index2:" + index2);
	}

}
