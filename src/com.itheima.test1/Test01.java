package com.itheima.test1;

public class Test01 {

	public static void main(String[] args) {
		int total = 0;
		int end = 100;
		//1.使用for循环计算
		/*for (int i = 1; i <= end; i++) {
			total += i;
		}*/
		
		//2.直接计算
		total = (1 + end)*end/2;    
		
		//注：以上两种方法即为算法，算法没有最好的，只有最适合的。
		
		System.out.println(total);
	}

}
