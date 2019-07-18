package com.itheima.tree;

public class TestBinaryTree {

	public static void main(String[] args) {
		//����һ����
		BinaryTree binTree = new BinaryTree();
		TreeNode root = new TreeNode(1);   //����һ�����ڵ�
		binTree.setRoot(root);             //�Ѹ��ڵ㸳����
		
		TreeNode rootL = new TreeNode(2);  //����һ����ڵ�
		root.setLeftNode(rootL);           //���´����Ľڵ�����Ϊ���ڵ���ӽڵ�
		
		TreeNode rootR = new TreeNode(3);  //����һ���ҽڵ�
		root.setRightNode(rootR);          //���´����Ľڵ�����Ϊ���ڵ���ӽڵ�
		
		TreeNode rootLl = new TreeNode(4);
		
		rootL.setLeftNode(rootLl);   //Ϊ�ڶ������ڵ㴴�������ӽڵ�
		rootL.setRightNode(new TreeNode(5));
		
		rootR.setLeftNode(new TreeNode(6));   //Ϊ�ڶ�����ҽڵ㴴�������ӽڵ�
		rootR.setRightNode(new TreeNode(7));
		
		rootLl.setLeftNode(new TreeNode(8));
		rootLl.setRightNode(new TreeNode(9));
		
		//ǰ�����
		System.out.print("ǰ�������");
		binTree.frontShow();
		System.out.println();
		//�������
		System.out.print("���������");
		binTree.midShow();
		System.out.println();
		//�������
		System.out.print("���������");
		binTree.afterShow();
		
		System.out.println("------------------");
		//ǰ�����
		TreeNode result = binTree.frontSearch(7);
		System.out.println(result);
		
		//ɾ������
		binTree.delete(4);
		binTree.frontShow();
	}

}
