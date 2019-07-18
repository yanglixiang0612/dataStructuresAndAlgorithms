package com.itheima.test1;

public class DoubleNode {
	DoubleNode pre = this;   //��һ���ڵ�
	DoubleNode next = this;   //��һ���ڵ�
	int data;         //�ڵ�����
	public DoubleNode(int data) {
		this.data = data;
	}
	
	//���ڵ�
	public void after(DoubleNode node) {
		DoubleNode nextNext = next;    //ԭ������һ���ڵ�
		this.next = node;       //���½ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
		node.pre = this;        //�ѵ�ǰ�ڵ���Ϊ�½ڵ��ǰһ���ڵ�
		node.next = nextNext;   //��ԭ������һ���ڵ���Ϊ�½ڵ����һ���ڵ�
		nextNext.pre = node;    //��ԭ������һ���ڵ��ǰһ���ڵ�Ϊ�½ڵ�
		
	}
	
	//��һ���ڵ�
	public DoubleNode next() {
		return this.next;
	}
	
	//��һ���ڵ�
	public DoubleNode pre() {
		return this.pre;
	}
	
	public int getData() {
		return this.data;
	}
	
}
