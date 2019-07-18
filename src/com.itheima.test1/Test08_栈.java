package com.itheima.test1;

public class Test08_栈 {

	public static void main(String[] args) {
		MyStack ms = new MyStack();   //创建一个栈
	    ms.push(7);  //压入数组
	    ms.push(8);
	    ms.push(9);
	    System.out.println(ms.pop());   //取出栈顶元素
	    System.out.println(ms.pop());   //取出栈顶元素
	    System.out.println(ms.pop());   //取出栈顶元素
	    System.out.println(ms.isEmpty());
	}

}
