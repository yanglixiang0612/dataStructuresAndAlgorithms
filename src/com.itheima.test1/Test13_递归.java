package com.itheima.test1;

public class Test13_�ݹ� {

	public static void main(String[] args) {
		print(3);
	}

	//�ݹ�
	public static void print(int i) {
		if(i > 0) {
			System.out.println(i);
			print(i - 1);
		}
	}

}
