package com.itheima.test1;

public class Test10_������ɾ������ڵ� {

	public static void main(String[] args) {
		//�����ڵ�
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		//׷�ӽڵ�
		/*n1.append(n2);
		n1.append(n3);         //����׷��,n1�����Ѿ����˽ڵ�n2.*/
		n1.append(n2).append(n3);
		//ȡ����һ���ڵ������
		//System.out.println(n1.next().next().getData());
		//System.out.println(n1.next().next().isLast());
		n1.show();
		//n1.next().removeNext();
		//n1.show();
		Node n4 = new Node(4);
		n2.after(n4);
		n1.show();
	}

}
