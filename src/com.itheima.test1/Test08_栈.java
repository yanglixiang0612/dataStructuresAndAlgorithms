package com.itheima.test1;

public class Test08_ջ {

	public static void main(String[] args) {
		MyStack ms = new MyStack();   //����һ��ջ
	    ms.push(7);  //ѹ������
	    ms.push(8);
	    ms.push(9);
	    System.out.println(ms.pop());   //ȡ��ջ��Ԫ��
	    System.out.println(ms.pop());   //ȡ��ջ��Ԫ��
	    System.out.println(ms.pop());   //ȡ��ջ��Ԫ��
	    System.out.println(ms.isEmpty());
	}

}
