package com.itheima.tree;

public class ThreadedBinaryTree {
	ThreadedNode root;
	ThreadedNode pre = null;   //������ʱ�洢ǰ�����
	
	//��������������
	public void threadIterate() {
		ThreadedNode node = root;   //������ʱ�洢��ǰ�����ڵ�
		while(node != null) {
			while(node.leftType == 0) {   //ѭ���ҵ��ʼ�Ľڵ�
				node = node.leftNode;
			}
			System.out.print(node.value + " ");   //��ӡ��ǰ�ڵ��ֵ
			//�����ǰ�ڵ����ָ��ָ����Ǻ�̽ڵ㣬���ܺ�̽ڵ㻹�к�̽ڵ�
			while(node.rightType == 1) {
				node = node.rightNode;
				System.out.print(node.value + " ");
			}
			//�滻�����Ľڵ�
			node = node.rightNode;
		}
	}
	
	//���ø��ڵ�
	public void setRoot(ThreadedNode root) {
		this.root = root;
	}
	
	//����������������
	public void threadNodes() {
		threadNodes(root);
	}


	private void threadNodes(ThreadedNode node) {
		if(node == null) {   //��ǰ�ڵ�Ϊnull��ֱ�ӷ���
			return;
		}
		
		threadNodes(node.leftNode);   //����������
		if(node.leftNode == null) {
			node.leftNode = pre;   //�õ�ǰ�ڵ����ָ��ָ��ǰ���ڵ� 
			node.leftType = 1;     //�ı䵱ǰ�ڵ����ָ������
		}
		
		//����ǰ������ָ�룬���ǰ���ڵ����ָ����null��û��ָ����������
		if(pre != null && pre.rightNode == null) {
			pre.rightNode = node;   //��ǰ���ڵ����ָ��ָ��ǰ�ڵ�
			pre.rightType = 1;      //�ı�ǰ���ڵ����ָ������
		}
		pre = node;    //ÿ����һ���ڵ㣬��ǰ�ڵ�����һ���ڵ��ǰ�����
		
		threadNodes(node.rightNode);   //����������
		
	}

	//��ȡ���ڵ�
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
