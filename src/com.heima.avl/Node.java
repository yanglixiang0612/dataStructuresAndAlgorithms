package com.heima.avl;

public class Node {
	int value;
	Node left;
	Node right;
	public Node(int value) {
		this.value = value;
	}
	
	//���ص�ǰ�ڵ�ĸ߶�
	public int height() {
		return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
	}
	
	//1.��ȡ�������ĸ߶�
	public int leftHeight() {
		if(left == null) {
			return 0;
		}
		return left.height();
	}
	
	//2.��ȡ�������ĸ߶�
	public int rightHeight() {
		if(right == null) {
			return 0;
		}
		return right.height();
	}
	//����������ӽڵ�
	public void add(Node node) {
		if(node == null) {
			return;
		}
		//�жϴ���Ľڵ��ֵ�ȵ�ǰ�����ĸ��ڵ��ֵ����С
		//��ӵĽڵ�ȵ�ǰ�ڵ��ֵ��С
		if(node.value < this.value) {
			//�����ڵ�Ϊ��
			if(this.left == null) {
				this.left = node;
			//�����ڵ㲻Ϊ��	
			}else {
				this.left.add(node);
			}
		}else {
			//����ҽڵ�Ϊ��
			if(this.right == null) {
				this.right = node;
			//����ҽڵ㲻Ϊ��
			}else {
				this.right.add(node);
			}
		}
		//��ѯ�Ƿ�ƽ��
		//1.��������ת
		if(leftHeight() - rightHeight() >= 2) {
			//˫��ת(�������)
			if(left != null && left.leftHeight() < left.rightHeight()) {
				left.leftRotate();
				rightRotate();
			//����ת
			}else {
				rightRotate();
			}
		}
		//2.����ת
		if(leftHeight() - rightHeight() <= -2) {
			//˫��ת(���Һ���)
			if(right != null && right.leftHeight() > right.rightHeight()) {
				right.rightRotate();
				leftHeight();
			//����ת
			}else {
				leftRotate();
			}
		}
	}
	
	//����ת
	public void leftRotate() {
		//����һ���µĽڵ㣬ֵ���ڵ�ǰ�ڵ��ֵ
		Node newLeft = new Node(value);
		//���½ڵ������������Ϊ��ǰ�ڵ��������
		newLeft.left = left;
		//���½ڵ������������Ϊ��ǰ�ڵ����������������
		newLeft.right = right.left;
		//�ѵ�ǰ�ڵ��ֵ����Ϊ���ӽڵ��ֵ
		value = right.value;
		//�ѵ�ǰ�ڵ������������Ϊ��������������
		right = right.right;
		//�ѵ�ǰ�ڵ������������Ϊ�½ڵ�
		left = newLeft;
	}
	
	//����ת
	public void rightRotate() {
		//����һ���µĽڵ㣬ֵ���ڵ�ǰ�ڵ��ֵ
		Node newRight = new Node(value);
		//���½ڵ������������Ϊ��ǰ�ڵ��������
		newRight.right = right;
		//���½ڵ������������Ϊ��ǰ�ڵ����������������
		newRight.left = left.right;
		//�ѵ�ǰ�ڵ��ֵ����Ϊ���ӽڵ��ֵ
		value = left.value;
		//�ѵ�ǰ�ڵ������������Ϊ��������������
		left = left.left;
		//�ѵ�ǰ�ڵ������������Ϊ�½ڵ�
		right = newRight;
	}

	public void midShow(Node node) {
		if(node == null) {
			return;
		}
		midShow(node.left);
		System.out.print(node.value + " ");
		midShow(node.right);
		
	}
	//���ҽڵ�
	public Node search(int value) {
		if(this.value == value) {
			return this;
		}else if(this.value > value) {
			if(left == null) {
				return null;
			}
			return left.search(value);
		}else {
			if(right == null) {
				return null;
			}
			return right.search(value);
		}
	}
	
	//�������ڵ�
	public Node searchParent(int value) {
		if((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
			return this;
		}else {
			if(this.value > value && this.left != null) {
				return this.left.searchParent(value);
			}else if(this.value < value && this.right != null) {
				return this.right.searchParent(value);
			}
			return null;
		}
		
	}
}
