package com.itheima.test1;

public class Test10_单链表删除插入节点 {

	public static void main(String[] args) {
		//创建节点
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		//追加节点
		/*n1.append(n2);
		n1.append(n3);         //经过追加,n1后面已经有了节点n2.*/
		n1.append(n2).append(n3);
		//取出下一个节点的数据
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
