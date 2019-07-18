package com.itheima.test1;

public class LoopNode {
	int data;   //节点内容
	LoopNode next = this;   //下一个节点
	public LoopNode(int data) {
		this.data = data;
	}
	//插入一个节点作为当前节点的下一个节点
	public void after(LoopNode node) {
		LoopNode nextNext = next;        //取出下一个节点作为下下一个节点
		this.next = node;            //把新节点作为当前节点的下一个节点
		node.next = nextNext;        //把下下一个节点作为新节点的下一个节点
	}
	//删除下一个节点
	public void removeNext() {
		LoopNode newNext = next.next;
		this.next = newNext;
	}
	
	//获取下一个节点
	public LoopNode next() {
		return this.next;
	}
	
	//获取节点中的数据
	public int getData() {
		return this.data;
	}
}
