package com.itheima.hefumantree2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHuffmanCode {

	public static void main(String[] args) {
		String msg = "can you can a can as a can canner can a can.";
		byte[] bytes = msg.getBytes();
		byte[] b = huffmanZip(bytes);   //���кշ�������ѹ��
		
	}

	 public static byte[] huffmanZip(byte[] bytes) {
		 List<Node> nodes = getNodes(bytes);  //��ͳ��ÿһ��byte���ֵĴ�����������һ��������
		 //����һ�úշ�����
		 Node tree = createHuffmanTree(nodes); 
		 //����һ���շ��������
		 Map<Byte, String> huffcodes = getCodes(tree);
		 System.out.println(huffCodes);
		 //����
		 byte[] b = zip(bytes,huffCodes);
		 return b;
	}
	//���кշ�������
	public static byte[] zip(byte[] bytes, Map<Byte, String> huffCodes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {      //����Ҫѹ����byte���鴦���һ�������Ƶ��ַ���
			sb.append(huffCodes.get(b));
		}
		System.out.println(sb.toString());
		//���峤��
		int len;
		if(sb.length()%8 == 0) {
			len = sb.length()/8;
		}else {
			len = sb.length()/8+1;
		}
		//���ڴ洢ѹ�����byte
		byte[] by = new byte[len];
		//��¼��byte��λ��
		int index = 0;
		for (int i = 0; i < sb.length(); i+=8) {
			String strByte;
			if(i+8>sb.length()) {
				strByte = sb.substring(i);
			}else {
				strByte = sb.substring(i,i+8);
			}
			byte byt = (byte)Integer.parseInt(strByte, 2);
			System.out.println(byt);
			by[index] = byt;
			index++;
		}
		
		return by;
	}
	//������ʱ�洢·��
	static StringBuilder sb = new StringBuilder();
	//���ڴ洢�շ�������
	static Map<Byte, String> huffCodes = new HashMap<>();
	//���ݺշ�������ȡ�շ�������
	public static Map<Byte, String> getCodes(Node tree) { 
		if(tree == null) {
			return null;
		}
		getCodes(tree.left,"0",sb);
		getCodes(tree.right,"1",sb);
		return huffCodes;
	}

	private static void getCodes(Node node, String code, StringBuilder sb) {
		StringBuilder sb2 = new StringBuilder(sb);
		sb2.append(code);
		if(node.data == null) {
			getCodes(node.left,"0",sb2);
			getCodes(node.right,"1",sb2);
		}else {
			huffCodes.put(node.data,sb2.toString());
		}
	}

	public static Node createHuffmanTree(List<Node> nodes) {
		while(nodes.size() > 1) {
			Collections.sort(nodes);
			Node left = nodes.get(nodes.size() - 1);
			Node right = nodes.get(nodes.size() - 2);
			Node parent = new Node(null, left.weight + right.weight);
			parent.left = left;
			parent.right = right;
			nodes.remove(left);
			nodes.remove(right);
			nodes.add(parent);
		}
		return nodes.get(0);
	}

	public static List<Node> getNodes(byte[] bytes) {
		List<Node> nodes = new ArrayList<>();
		Map<Byte, Integer> counts = new HashMap<>();  //�洢ÿһ��byte�����˶��ٴ�
		for (byte b : bytes) {      //ͳ��ÿһ��byte���ֵĴ���
			Integer count = counts.get(b);
			if(count == null) {
				counts.put(b, 1);
			}else {
				counts.put(b, count+1);
			}
		}
		
		//��ÿһ����ֵ��תΪһ��node����
		for(Map.Entry<Byte, Integer> entry : counts.entrySet()) {
			nodes.add(new Node(entry.getKey(), entry.getValue()));
		}
		return nodes;
	}

}
