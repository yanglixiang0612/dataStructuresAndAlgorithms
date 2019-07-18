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
		byte[] b = huffmanZip(bytes);   //进行赫夫曼编码压缩
		
	}

	 public static byte[] huffmanZip(byte[] bytes) {
		 List<Node> nodes = getNodes(bytes);  //先统计每一个byte出现的次数，并放入一个集合中
		 //创建一棵赫夫曼树
		 Node tree = createHuffmanTree(nodes); 
		 //创建一个赫夫曼编码表
		 Map<Byte, String> huffcodes = getCodes(tree);
		 System.out.println(huffCodes);
		 //编码
		 byte[] b = zip(bytes,huffCodes);
		 return b;
	}
	//进行赫夫曼编码
	public static byte[] zip(byte[] bytes, Map<Byte, String> huffCodes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {      //把需要压缩的byte数组处理成一个二进制的字符串
			sb.append(huffCodes.get(b));
		}
		System.out.println(sb.toString());
		//定义长度
		int len;
		if(sb.length()%8 == 0) {
			len = sb.length()/8;
		}else {
			len = sb.length()/8+1;
		}
		//用于存储压缩后的byte
		byte[] by = new byte[len];
		//记录新byte的位置
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
	//用于临时存储路径
	static StringBuilder sb = new StringBuilder();
	//用于存储赫夫曼编码
	static Map<Byte, String> huffCodes = new HashMap<>();
	//根据赫夫曼树获取赫夫曼编码
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
		Map<Byte, Integer> counts = new HashMap<>();  //存储每一个byte出现了多少次
		for (byte b : bytes) {      //统计每一个byte出现的次数
			Integer count = counts.get(b);
			if(count == null) {
				counts.put(b, 1);
			}else {
				counts.put(b, count+1);
			}
		}
		
		//把每一个键值对转为一个node对象
		for(Map.Entry<Byte, Integer> entry : counts.entrySet()) {
			nodes.add(new Node(entry.getKey(), entry.getValue()));
		}
		return nodes;
	}

}
