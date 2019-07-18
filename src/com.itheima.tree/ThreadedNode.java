package com.itheima.tree;

public class ThreadedNode {
	int value;
	ThreadedNode leftNode;    //左儿子
	ThreadedNode rightNode;   //右儿子
	//标识指针类型
	int leftType;
	int rightType;
	public ThreadedNode(int value) {
		this.value = value;
	}
	
	public void setLeftNode(ThreadedNode leftNode) {
		this.leftNode = leftNode;
	}
	public void setRightNode(ThreadedNode rightNode) {
		this.rightNode = rightNode;
	}

	//前序遍历
	public void frontShow() {
		System.out.print(value + " ");  //先遍历当前节点的内容
		if(leftNode != null) {          //左节点
			leftNode.frontShow();
		}
		
		if(rightNode != null) {          //右节点
			rightNode.frontShow();
		}
	}
	
	//中序遍历
	public void midShow() {
		if(leftNode != null) {          //左节点
			leftNode.midShow();
		}
		
		System.out.print(value + " ");  //先遍历当前节点的内容
		
		if(rightNode != null) {          //右节点
			rightNode.midShow();
		}
	}

	//后序遍历
	public void afterShow() {
		if(leftNode != null) {          //左节点
			leftNode.afterShow();
		}
		
		if(rightNode != null) {          //右节点
			rightNode.afterShow();
		}
		
		System.out.print(value + " ");  //先遍历当前节点的内容
	}

	public ThreadedNode frontSearch(int i) {           //前序查找
		ThreadedNode target = null;
		if(this.value == i) {
			return this;
		}else {
			if(leftNode != null) {
				target = leftNode.frontSearch(i);
			}
			if(target != null) {
				return target;
			}
			if(rightNode != null) {
				target = rightNode.frontSearch(i);
			}
		}
		return target;
	}
	
	//删除一棵子树
	public void delete(int i) {
		ThreadedNode parent = this;
		//判断左儿子
		if(parent.leftNode != null && parent.leftNode.value == i) {
			parent.leftNode = null;
			return;
		}
		
		//判断右儿子
		if(parent.rightNode != null && parent.rightNode.value == i) {
			parent.rightNode = null;
			return;
		}
		
		//递归检查并删除左儿子
		parent = leftNode;
		if(parent != null) {
			parent.delete(i);
		}
		
		//递归检查并删除右儿子
		parent = rightNode;
		if(parent != null) {
			parent.delete(i);
		}
	}
}
