package com.itheima.tree;

public class ThreadedBinaryTree {
	ThreadedNode root;
	ThreadedNode pre = null;   //用于临时存储前驱结点
	
	//遍历线索二叉树
	public void threadIterate() {
		ThreadedNode node = root;   //用于临时存储当前遍历节点
		while(node != null) {
			while(node.leftType == 0) {   //循环找到最开始的节点
				node = node.leftNode;
			}
			System.out.print(node.value + " ");   //打印当前节点的值
			//如果当前节点的右指针指向的是后继节点，可能后继节点还有后继节点
			while(node.rightType == 1) {
				node = node.rightNode;
				System.out.print(node.value + " ");
			}
			//替换遍历的节点
			node = node.rightNode;
		}
	}
	
	//设置根节点
	public void setRoot(ThreadedNode root) {
		this.root = root;
	}
	
	//中序线索化二叉树
	public void threadNodes() {
		threadNodes(root);
	}


	private void threadNodes(ThreadedNode node) {
		if(node == null) {   //当前节点为null，直接返回
			return;
		}
		
		threadNodes(node.leftNode);   //处理左子树
		if(node.leftNode == null) {
			node.leftNode = pre;   //让当前节点的左指针指向前驱节点 
			node.leftType = 1;     //改变当前节点的左指针类型
		}
		
		//处理前驱的右指针，如果前驱节点的右指针是null（没有指向右子树）
		if(pre != null && pre.rightNode == null) {
			pre.rightNode = node;   //让前驱节点的右指针指向当前节点
			pre.rightType = 1;      //改变前驱节点的右指针类型
		}
		pre = node;    //每处理一个节点，当前节点是下一个节点的前驱结点
		
		threadNodes(node.rightNode);   //处理右子树
		
	}

	//获取根节点
	public ThreadedNode getRoot() {
		return root;
	}
	
	public void frontShow() {
		if(root != null) {
			root.frontShow();
		}
	}

	public void midShow() {
		if(root != null) {
			root.midShow();
		}
	}

	public void afterShow() {
		if(root != null) {
			root.afterShow();
		}
	}

	public ThreadedNode frontSearch(int i) {
		return root.frontSearch(i);
	}

	public void delete(int i) {
		if(root.value == i) {
			root = null;
		}else {
			root.delete(i);
		}
	}
}
