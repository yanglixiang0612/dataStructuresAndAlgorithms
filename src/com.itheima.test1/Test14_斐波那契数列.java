package com.itheima.test1;

public class Test14_쳲��������� {

	public static void main(String[] args) {
		//쳲��������У�1 1 2 3 5 8 13
		int i = febonacci(6);
		System.out.println(i);
	}

	public static int febonacci(int i) {
		if(i == 1 || i == 2) {
			return 1;
		}else {
			return febonacci(i - 1) + febonacci(i - 2);
		}
	}

}
