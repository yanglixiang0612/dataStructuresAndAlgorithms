package com.itheima.tree;

public class ArrayBinaryTree {
	int[] data;
	public ArrayBinaryTree(int[] data) {
		this.data = data;
	}
	
	public void frontShow() {
		frontShow(0);
	}
	
	//前序遍历
	public void frontShow(int index) {
		if(data == null || data.length == 0) {
			return;
		}
		
		System.out.print(data[index] + " ");      //先遍历当前节点的内容
		if(2*index+1 < data.length) {         //2*index+1：处理左子树
			frontShow(2*index+1);
		}
		
		if(2*index+2 < data.length) {         //2*index+2：处理右子树
			frontShow(2*index+2);
		}
		
	}
}
