package com.itheima.hefumantree2;

public class Node implements Comparable<Node>{
	Byte data;
	int weight;
	Node left;
	Node right;
	public Node(Byte data,int weight) {
		this.data = data;
		this.weight = weight;
	}
	@Override
	public int compareTo(Node o) {
		return o.weight - this.weight;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", weight=" + weight + "]";
	}
	
	
	
}
