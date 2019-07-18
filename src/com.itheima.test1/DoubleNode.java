package com.itheima.test1;

public class DoubleNode {
	DoubleNode pre = this;   //上一个节点
	DoubleNode next = this;   //下一个节点
	int data;         //节点数据
	public DoubleNode(int data) {
		this.data = data;
	}
	
	//增节点
	public void after(DoubleNode node) {
		DoubleNode nextNext = next;    //原来的下一个节点
		this.next = node;       //把新节点作为当前节点的下一个节点
		node.pre = this;        //把当前节点作为新节点的前一个节点
		node.next = nextNext;   //让原来的下一个节点作为新节点的下一个节点
		nextNext.pre = node;    //让原来的下一个节点的前一个节点为新节点
		
	}
	
	//下一个节点
	public DoubleNode next() {
		return this.next;
	}
	
	//上一个节点
	public DoubleNode pre() {
		return this.pre;
	}
	
	public int getData() {
		return this.data;
	}
	
}
