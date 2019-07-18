package com.itheima.tree;

public class TestThreadedBinaryTree {

	public static void main(String[] args) {
		//����һ����
		ThreadedBinaryTree binTree = new ThreadedBinaryTree();
		ThreadedNode root = new ThreadedNode(1);   //����һ�����ڵ�
		binTree.setRoot(root);             //�Ѹ��ڵ㸳����
		
		ThreadedNode rootL = new ThreadedNode(2);  //����һ����ڵ�
		root.setLeftNode(rootL);           //���´����Ľڵ�����Ϊ���ڵ���ӽڵ�
		
		ThreadedNode rootR = new ThreadedNode(3);  //����һ���ҽڵ�
		root.setRightNode(rootR);          //���´����Ľڵ�����Ϊ���ڵ���ӽڵ�
		
		ThreadedNode rootLl = new ThreadedNode(4);
		ThreadedNode fiveNode = new ThreadedNode(5);
		
		rootL.setLeftNode(rootLl);   //Ϊ�ڶ������ڵ㴴�������ӽڵ�
		rootL.setRightNode(fiveNode);
		
		rootR.setLeftNode(new ThreadedNode(6));   //Ϊ�ڶ�����ҽڵ㴴�������ӽڵ�
		rootR.setRightNode(new ThreadedNode(7));
		
		//ǰ�����
		System.out.print("ǰ�������");
		binTree.frontShow();
		System.out.println();
		
		//�������
		System.out.print("���������");
		binTree.afterShow();
		
		System.out.println("------------------");
		//ǰ�����
		ThreadedNode result = binTree.frontSearch(7);
		System.out.println(result);
		
		/*//ɾ������
		binTree.delete(4);
		binTree.frontShow();*/
		
		//�������
		System.out.print("���������");
		binTree.midShow();
		System.out.println();
		System.out.println("------------------");
		
		//����������������
		binTree.threadNodes();
		
		//��������������
		binTree.threadIterate();
		
		
	}

}
