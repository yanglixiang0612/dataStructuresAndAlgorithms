package com.itheima.test1;

public class Test09_���� {

	public static void main(String[] args) {
		MyQueue mq = new MyQueue();    //����һ������
		mq.add(9);     //���
		mq.add(8);
		mq.add(7);
		System.out.println(mq.poll());   //����
		System.out.println(mq.poll());   //����
		System.out.println(mq.poll());   //����
		System.out.println(mq.isEmpty());
	}

}
