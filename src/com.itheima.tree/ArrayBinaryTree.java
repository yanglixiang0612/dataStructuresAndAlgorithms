package com.itheima.tree;

public class ArrayBinaryTree {
	int[] data;
	public ArrayBinaryTree(int[] data) {
		this.data = data;
	}
	
	public void frontShow() {
		frontShow(0);
	}
	
	//ǰ�����
	public void frontShow(int index) {
		if(data == null || data.length == 0) {
			return;
		}
		
		System.out.print(data[index] + " ");      //�ȱ�����ǰ�ڵ������
		if(2*index+1 < data.length) {         //2*index+1������������
			frontShow(2*index+1);
		}
		
		if(2*index+2 < data.length) {         //2*index+2������������
			frontShow(2*index+2);
		}
		
	}
}
