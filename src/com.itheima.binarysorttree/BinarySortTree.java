package com.itheima.binarysorttree;

public class BinarySortTree {
	Node root;
	//�����������ӽڵ�
	public void add(Node node) {
		//�����һ�ÿ���
		if(root == null) {
			root = node;
		}else {
			root.add(node);
		}
	}
	
	//���������������������С�����˳��
	public void midShow() {
		if(root != null) {
			root.midShow(root);
		}
	}
	
	//�ڵ�Ĳ���
	public Node search(int value) {
		if(root == null) {
			return null;
		}else {
			return root.search(value);
		}
	}
	
	//ɾ���ڵ�
	public void delete(int value) {
		if(root == null) {
			return;
		}else {
			//�ҵ�����ڵ�
			Node target = search(value);
			//���û������ڵ�
			if(target == null) {
				return;
			}
			//�ҵ����ĸ��ڵ�
			Node parent = searchParent(value);
			
			//1.Ҫɾ���Ľڵ���Ҷ�ӽڵ�
			if(target.left == null && target.right == null) {
				//Ҫɾ���Ľڵ��Ǹ��ڵ�����ӽڵ�
				if(parent.left.value == value) {
					parent.left = null;
				//Ҫɾ���Ľڵ��Ǹ��ڵ�����ӽڵ�
				}else {
					parent.right = null;
				}
			
			//2.Ҫɾ���Ľڵ��������ӽڵ�����
			}else if(target.left != null && target.right != null) {
				//ɾ����������ֵ��С�Ľڵ㣬��ȡ���ýڵ��ֵ
				int min = deleteMin(target.right);
				//�滻Ŀ��ڵ��е�ֵ
				target.value = min;
			
			//3.Ҫɾ���Ľڵ���һ�����ӽڵ�����ӽڵ�����
			}else {
				//�����ӽڵ�
				if(target.left != null) {
					//Ҫɾ���Ľڵ��Ǹ��ڵ�����ӽڵ�
					if(parent.left.value == value) {
						parent.left = target.left;
					//Ҫɾ���Ľڵ��Ǹ��ڵ�����ӽڵ�	
					}else {
						parent.right = target.left;
					}
					
				//�����ӽڵ�
				}else {
					//Ҫɾ���Ľڵ��Ǹ��ڵ�����ӽڵ�
					if(parent.left.value == value) {
						parent.left = target.right;
					//Ҫɾ���Ľڵ��Ǹ��ڵ�����ӽڵ�	
					}else {
						parent.right = target.right;
					}
				}
			}
		}
	}
	
	//ɾ��һ������С�Ľڵ�
	public int deleteMin(Node node) {
		Node target = node;
		while(target.left != null) {
			target = target.left;
		}
		//ɾ����С������ڵ�
		delete(target.value);
		return target.value;
	}

	//�������ڵ�
	public Node searchParent(int value) {
		if(root == null) {
			return null;
		}else {
			return root.searchParent(value);
		}
	}
}
