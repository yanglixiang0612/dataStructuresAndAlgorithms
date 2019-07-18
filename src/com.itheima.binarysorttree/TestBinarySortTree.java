package com.itheima.binarysorttree;

public class TestBinarySortTree {

	public static void main(String[] args) {
		int[] arr = new int[] {7,3,10,12,5,1,9};
		//����һ�ö���������
		BinarySortTree bst = new BinarySortTree();
		//ѭ�����
		for (int i : arr) {
			bst.add(new Node(i));
		}
		
		//�鿴���е�ֵ
		bst.midShow();
		System.out.println();
		System.out.println("----------");
		/*//����
		Node node = bst.search(10);
		System.out.println(node.value);
		Node node1 = bst.search(20);
		System.out.println(node1);
		System.out.println("----------");*/
		/*//���Բ��Ҹ��ڵ�
		Node p1 = bst.searchParent(3);
		System.out.println(p1.value);*/
		/*//ɾ��Ҷ�ӽڵ�
		bst.delete(5);
		bst.midShow();
		System.out.println();
		System.out.println("==========");
		bst.delete(3);*/
		bst.delete(7);
		bst.midShow();
		
	}

}
