package com.itheima.test1;

public class MyStack {           //栈：先进后出
	int[] elements;        //栈的底层我们使用数组来存储数据
	public MyStack() {
		elements = new int[0];
	}
	
	public void push(int element) {     //压入元素
		int[] newArr = new int[elements.length + 1];   //创建一个新的数组
		for (int i = 0; i < elements.length; i++) {    //把原数组中的元素复制到新数组中
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;         //把添加的元素放入新数组中
		elements = newArr;        //使用新数组替换旧数组
	}
	
	public int pop() {             //取出栈顶元素
		if(elements.length == 0) {
			throw new RuntimeException("Stack is empty");
		}
		int element = elements[elements.length - 1];  //取出数组的最后一个元素
		int[] newArr = new int[elements.length - 1];
		for (int i = 0; i < elements.length - 1; i++) {
			newArr[i] = elements[i];
		}
		elements = newArr; 
		return element;
	}
	
	//查看栈顶元素
	public int peek() {
		if(elements.length == 0) {
			throw new RuntimeException("Stack is empty");
		}
		return elements[elements.length - 1];
	}
	
	//判断栈是否为空
	public boolean isEmpty() {
		return elements.length == 0;
	}
	
}
