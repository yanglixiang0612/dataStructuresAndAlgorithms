package com.itheima.tree;

public class TestBinaryTree {

	public static void main(String[] args) {
		//创建一棵树
		BinaryTree binTree = new BinaryTree();
		TreeNode root = new TreeNode(1);   //创建一个根节点
		binTree.setRoot(root);             //把根节点赋给树
		
		TreeNode rootL = new TreeNode(2);  //创建一个左节点
		root.setLeftNode(rootL);           //把新创建的节点设置为根节点的子节点
		
		TreeNode rootR = new TreeNode(3);  //创建一个右节点
		root.setRightNode(rootR);          //把新创建的节点设置为根节点的子节点
		
		TreeNode rootLl = new TreeNode(4);
		
		rootL.setLeftNode(rootLl);   //为第二层的左节点创建两个子节点
		rootL.setRightNode(new TreeNode(5));
		
		rootR.setLeftNode(new TreeNode(6));   //为第二层的右节点创建两个子节点
		rootR.setRightNode(new TreeNode(7));
		
		rootLl.setLeftNode(new TreeNode(8));
		rootLl.setRightNode(new TreeNode(9));
		
		//前序遍历
		System.out.print("前序遍历：");
		binTree.frontShow();
		System.out.println();
		//中序遍历
		System.out.print("中序遍历：");
		binTree.midShow();
		System.out.println();
		//后序遍历
		System.out.print("后序遍历：");
		binTree.afterShow();
		
		System.out.println("------------------");
		//前序查找
		TreeNode result = binTree.frontSearch(7);
		System.out.println(result);
		
		//删除子树
		binTree.delete(4);
		binTree.frontShow();
	}

}
