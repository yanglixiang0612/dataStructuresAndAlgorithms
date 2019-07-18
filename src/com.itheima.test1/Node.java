package com.itheima.test1;

public class Node {
	int data;   //节点内容
	Node next;   //下一个节点
	public Node(int data) {
		this.data = data;
	}
	
	//为节点追加节点
	public Node append(Node node) {
		Node currentNode = this;  //当前节点
		while(true) {
			Node nextNode = currentNode.next;
			if(nextNode == null) {
				break;
			}
			currentNode = nextNode;
		}
		//把需要追回的节点追加为找到的当前节点的下一个节点
		currentNode.next = node;
		return this;        //此处this还是开始的节点(Node currentNode = this;  //当前节点),例如：n1.
	}
	
	//插入一个节点作为当前节点的下一个节点
	public void after(Node node) {
		Node nextnext = next;        //取出下一个节点作为下下一个节点
		this.next = node;            //把新节点作为当前节点的下一个节点
		node.next = nextnext;        //把下下一个节点作为新节点的下一个节点
	}
	
	//显示所有节点信息
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
	
	
	//删除下一个节点
	public void removeNext() {
		Node newNext = next.next;
		this.next = newNext;
	}
	
	//获取下一个节点
	public Node next() {
		return this.next;
	}
	
	//获取节点中的数据
	public int getData() {
		return this.data;
	}
	
	//当前节点是否是最后一个节点
	public boolean isLast() {
		return next == null;
	}
}
