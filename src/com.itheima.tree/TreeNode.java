package com.itheima.tree;

public class TreeNode {
	int value;
	TreeNode leftNode;    //�����
	TreeNode rightNode;   //�Ҷ���
	public TreeNode(int value) {
		this.value = value;
	}
	
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	//ǰ�����
	public void frontShow() {
		System.out.print(value + " ");  //�ȱ�����ǰ�ڵ������
		if(leftNode != null) {          //��ڵ�
			leftNode.frontShow();
		}
		
		if(rightNode != null) {          //�ҽڵ�
			rightNode.frontShow();
		}
	}
	
	//�������
	public void midShow() {
		if(leftNode != null) {          //��ڵ�
			leftNode.midShow();
		}
		
		System.out.print(value + " ");  //�ȱ�����ǰ�ڵ������
		
		if(rightNode != null) {          //�ҽڵ�
			rightNode.midShow();
		}
	}

	//�������
	public void afterShow() {
		if(leftNode != null) {          //��ڵ�
			leftNode.afterShow();
		}
		
		if(rightNode != null) {          //�ҽڵ�
			rightNode.afterShow();
		}
		
		System.out.print(value + " ");  //�ȱ�����ǰ�ڵ������
	}

	public TreeNode frontSearch(int i) {           //ǰ�����
		TreeNode target = null;
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
	
	//ɾ��һ������
	public void delete(int i) {
		TreeNode parent = this;
		//�ж������
		if(parent.leftNode != null && parent.leftNode.value == i) {
			parent.leftNode = null;
			return;
		}
		
		//�ж��Ҷ���
		if(parent.rightNode != null && parent.rightNode.value == i) {
			parent.rightNode = null;
			return;
		}
		
		//�ݹ��鲢ɾ�������
		parent = leftNode;
		if(parent != null) {
			parent.delete(i);
		}
		
		//�ݹ��鲢ɾ���Ҷ���
		parent = rightNode;
		if(parent != null) {
			parent.delete(i);
		}
	}
}