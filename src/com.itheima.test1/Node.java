package com.itheima.test1;

public class Node {
	int data;   //�ڵ�����
	Node next;   //��һ���ڵ�
	public Node(int data) {
		this.data = data;
	}
	
	//Ϊ�ڵ�׷�ӽڵ�
	public Node append(Node node) {
		Node currentNode = this;  //��ǰ�ڵ�
		while(true) {
			Node nextNode = currentNode.next;
			if(nextNode == null) {
				break;
			}
			currentNode = nextNode;
		}
		//����Ҫ׷�صĽڵ�׷��Ϊ�ҵ��ĵ�ǰ�ڵ����һ���ڵ�
		currentNode.next = node;
		return this;        //�˴�this���ǿ�ʼ�Ľڵ�(Node currentNode = this;  //��ǰ�ڵ�),���磺n1.
	}
	
	//����һ���ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
	public void after(Node node) {
		Node nextnext = next;        //ȡ����һ���ڵ���Ϊ����һ���ڵ�
		this.next = node;            //���½ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
		node.next = nextnext;        //������һ���ڵ���Ϊ�½ڵ����һ���ڵ�
	}
	
	//��ʾ���нڵ���Ϣ
	public void show() {
		Node currentNode = this;
		while(true) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
			if(currentNode == null) {
				break;
			}
		}
		System.out.println();
		
	}
	
	
	//ɾ����һ���ڵ�
	public void removeNext() {
		Node newNext = next.next;
		this.next = newNext;
	}
	
	//��ȡ��һ���ڵ�
	public Node next() {
		return this.next;
	}
	
	//��ȡ�ڵ��е�����
	public int getData() {
		return this.data;
	}
	
	//��ǰ�ڵ��Ƿ������һ���ڵ�
	public boolean isLast() {
		return next == null;
	}
}
