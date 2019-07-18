package com.itheima.test1;

public class MyStack {           //ջ���Ƚ����
	int[] elements;        //ջ�ĵײ�����ʹ���������洢����
	public MyStack() {
		elements = new int[0];
	}
	
	public void push(int element) {     //ѹ��Ԫ��
		int[] newArr = new int[elements.length + 1];   //����һ���µ�����
		for (int i = 0; i < elements.length; i++) {    //��ԭ�����е�Ԫ�ظ��Ƶ���������
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;         //����ӵ�Ԫ�ط�����������
		elements = newArr;        //ʹ���������滻������
	}
	
	public int pop() {             //ȡ��ջ��Ԫ��
		if(elements.length == 0) {
			throw new RuntimeException("Stack is empty");
		}
		int element = elements[elements.length - 1];  //ȡ����������һ��Ԫ��
		int[] newArr = new int[elements.length - 1];
		for (int i = 0; i < elements.length - 1; i++) {
			newArr[i] = elements[i];
		}
		elements = newArr; 
		return element;
	}
	
	//�鿴ջ��Ԫ��
	public int peek() {
		if(elements.length == 0) {
			throw new RuntimeException("Stack is empty");
		}
		return elements[elements.length - 1];
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty() {
		return elements.length == 0;
	}
	
}
