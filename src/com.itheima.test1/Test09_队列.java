package com.itheima.test1;

public class Test09_队列 {

	public static void main(String[] args) {
		MyQueue mq = new MyQueue();    //创建一个队列
		mq.add(9);     //入队
		mq.add(8);
		mq.add(7);
		System.out.println(mq.poll());   //出队
		System.out.println(mq.poll());   //出队
		System.out.println(mq.poll());   //出队
		System.out.println(mq.isEmpty());
	}

}
