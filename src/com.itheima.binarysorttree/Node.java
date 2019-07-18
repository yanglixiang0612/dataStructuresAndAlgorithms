package com.itheima.binarysorttree;

public class Node {
	int value;
	Node left;
	Node right;
	public Node(int value) {
		this.value = value;
	}
	//����������ӽڵ�
	public void add(Node node) {
		if(node == null) {
			return;
		}
		//�жϴ���Ľڵ��ֵ�ȵ�ǰ�����ĸ��ڵ��ֵ����С
		//��ӵĽڵ�ȵ�ǰ�ڵ��ֵ��С
		if(node.value < this.value) {
			//�����ڵ�Ϊ��
			if(this.left == null) {
				this.left = node;
			//�����ڵ㲻Ϊ��	
			}else {
				this.left.add(node);
			}
		}else {
			//����ҽڵ�Ϊ��
			if(this.right == null) {
				this.right = node;
			//����ҽڵ㲻Ϊ��
			}else {
				this.right.add(node);
			}
		}
	}
	public void midShow(Node node) {
		if(node == null) {
			return;
		}
		midShow(node.left);
		System.out.print(node.value + " ");
		midShow(node.right);
		
	}
	//���ҽڵ�
	public Node search(int value) {
		if(this.value == value) {
			return this;
		}else if(this.value > value) {
			if(left == null) {
				return null;
			}
			return left.search(value);
		}else {
			if(right == null) {
				return null;
			}
			return right.search(value);
		}
	}
	
	//�������ڵ�
	public Node searchParent(int value) {
		if((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
			return this;
		}else {
			if(this.value > value && this.left != null) {
				return this.left.searchParent(value);
			}else if(this.value < value && this.right != null) {
				return this.right.searchParent(value);
			}
			return null;
		}
		
	}
}
