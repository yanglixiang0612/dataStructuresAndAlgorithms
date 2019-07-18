package com.itheima.test1;

public class LoopNode {
	int data;   //�ڵ�����
	LoopNode next = this;   //��һ���ڵ�
	public LoopNode(int data) {
		this.data = data;
	}
	//����һ���ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
	public void after(LoopNode node) {
		LoopNode nextNext = next;        //ȡ����һ���ڵ���Ϊ����һ���ڵ�
		this.next = node;            //���½ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
		node.next = nextNext;        //������һ���ڵ���Ϊ�½ڵ����һ���ڵ�
	}
	//ɾ����һ���ڵ�
	public void removeNext() {
		LoopNode newNext = next.next;
		this.next = newNext;
	}
	
	//��ȡ��һ���ڵ�
	public LoopNode next() {
		return this.next;
	}
	
	//��ȡ�ڵ��е�����
	public int getData() {
		return this.data;
	}
}
