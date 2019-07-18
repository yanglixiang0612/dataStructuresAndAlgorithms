package com.heima.graph;

import com.itheima.test1.MyStack;

//ͼ
public class Graph {
	private Vertex[] vertex;
	private int currentSize;
	public int[][] adjMat;
	private MyStack stack = new MyStack();
	private int currentIndex;
	public Graph(int size) {
		vertex = new Vertex[size];
		adjMat = new int[size][size];
	}
	
	//��ͼ����Ӷ���
	public void addVertex(Vertex v) {
		vertex[currentSize++] = v;
	}
	
	public void addEdge(String v1,String v2) {
		//�ҳ�����������±�
		int index1 = 0;
		for (int i = 0; i < vertex.length; i++) {
			if(vertex[i].getValue().equals(v1)) {
				index1 = i;
				break;
			}
		}
		
		int index2 = 0;
		for (int i = 0; i < vertex.length; i++) {
			if(vertex[i].getValue().equals(v2)) {
				index2 = i;
				break;
			}
		}
		
		adjMat[index1][index2] = 1;
		adjMat[index2][index1] = 1;
	}
	
	//������������㷨����ͼ
	public void dfs() {
		//�ѵ�0��������Ϊ�ѷ���״̬
		vertex[0].visited = true;
		//��0��������±�
		stack.push(0);
		//��ӡ�����ֵ
		System.out.println(vertex[0].getValue());
		//����
		out:while(!stack.isEmpty()) {
			for (int i = currentIndex + 1; i < vertex.length; i++) {
				//�������һ��������Ԫ����ͨ��
				if(adjMat[currentIndex][i] == 1 && vertex[i].visited == false) {
					//����һ��Ԫ��ѹ��ջ��
					stack.push(i);
					vertex[i].visited = true;
					System.out.println(vertex[i].getValue());
					continue out;
				}
			}
			//����ջ��Ԫ��
			stack.pop();
			//�޸ĵ�ǰλ��Ϊջ��Ԫ��λ��
			if(!stack.isEmpty()) {
			currentIndex = stack.peek();
			}
			
		}
		
	}
	
}
