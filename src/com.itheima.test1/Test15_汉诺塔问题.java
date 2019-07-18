package com.itheima.test1;

public class Test15_汉诺塔问题 {

	public static void main(String[] args) {
		hanoi(20,'A','B','C');
		
	}
	/**
	 * @param n 共有N个盘子
	 * @param from 开始的柱子
	 * @param in 中间的柱子
	 * @param to 目标柱子
	 * 无论有多少个盘子，都认为只有两个。上面所有的盘子和最下面一个盘子
	 */

	public static void hanoi(int n,char from,char in,char to) {
		//只有一个盘子
		if(n == 1) {
			System.out.println("第1个盘子从" + from + "移到" + to);
		}else {
			hanoi(n-1, from, to, in);   //移动上面所有的盘子到中间位置
			System.out.println("第" + n + "个盘子从" + from + "移到" + to);//移动下面的盘子
			hanoi(n-1, in, from, to);  //把上面所有的盘子从中间移到目标位置
			
		}
	}
	

}
