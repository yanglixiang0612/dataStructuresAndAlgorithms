package com.itheima.tree;

public class TestThreadedBinaryTree {

	public static void main(String[] args) {
		//创建一棵树
		ThreadedBinaryTree binTree = new ThreadedBinaryTree();
		ThreadedNode root = new ThreadedNode(1);   //创建一个根节点
		binTree.setRoot(root);             //把根节点赋给树
		
		ThreadedNode rootL = new ThreadedNode(2);  //创建一个左节点
		root.setLeftNode(rootL);           //把新创建的节点设置为根节点的子节点
		
		ThreadedNode rootR = new ThreadedNode(3);  //创建一个右节点
		root.setRightNode(rootR);          //把新创建的节点设置为根节点的子节点
		
		ThreadedNode rootLl = new ThreadedNode(4);
		ThreadedNode fiveNode = new ThreadedNode(5);
		
		rootL.setLeftNode(rootLl);   //为第二层的左节点创建两个子节点
		rootL.setRightNode(fiveNode);
		
		rootR.setLeftNode(new ThreadedNode(6));   //为第二层的右节点创建两个子节点
		rootR.setRightNode(new ThreadedNode(7));
		
		//前序遍历
		System.out.print("前序遍历：");
		binTree.frontShow();
		System.out.println();
		
		//后序遍历
		System.out.print("后序遍历：");
		binTree.afterShow();
		
		System.out.println("------------------");
		//前序查找
		ThreadedNode result = binTree.frontSearch(7);
		System.out.println(result);
		
		/*//删除子树
		binTree.delete(4);
		binTree.frontShow();*/
		
		//中序遍历
		System.out.print("中序遍历：");
		binTree.midShow();
		System.out.println();
		System.out.println("------------------");
		
		//中序线索化二叉树
		binTree.threadNodes();
		
		//线索二叉树遍历
		binTree.threadIterate();
		
		
	}

}
