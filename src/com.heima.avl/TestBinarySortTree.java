package com.heima.avl;

public class TestBinarySortTree {

	public static void main(String[] args) {
		//int[] arr = new int[] {8,9,6,7,5,4};
		int[] arr = new int[] {8,9,5,4,6,7};
		//����һ�ö���������
		BinarySortTree bst = new BinarySortTree();
		//ѭ�����
		for (int i : arr) {
			bst.add(new Node(i));
		}
		
		//�鿴�߶�
		System.out.println(bst.root.height());
		System.out.println(bst.root.value);
		
		
		
		
	}

}
