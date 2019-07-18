package com.itheima.hefumantree1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestHuffmanTree {

	public static void main(String[] args) {
		int[] arr = {3,7,8,29,5,11,23,14};
		Node node = createHuffmanTree(arr);
		System.out.println(node);
	}

	//�����շ�����
	public static Node createHuffmanTree(int[] arr) {
		List<Node> nodes = new ArrayList<>();   //��ʹ�����������е�Ԫ�ش������ɸ�����������ֻ��һ���ڵ㣩
		for (int value : arr) {
			nodes.add(new Node(value));
		}
		//ѭ������
		while(nodes.size() > 1) {
			Collections.sort(nodes);         //����
			//ȡ����Ȩֵ��С������������
			Node left = nodes.get(nodes.size() - 1);  //ȡ��Ȩֵ��С�Ķ�����
			Node right = nodes.get(nodes.size() - 2);  //ȡ��Ȩֵ��С�Ķ�����
			Node parent = new Node(left.value + right.value);  //����һ���µĶ�����
			nodes.remove(left);     //��ȡ�����������������Ƴ�
			nodes.remove(right);
			nodes.add(parent);      //����ԭ���Ķ�����������
		}
		return nodes.get(0);
	}

}
