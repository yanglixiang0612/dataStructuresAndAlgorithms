package com.heima.avl;

public class Node {
	int value;
	Node left;
	Node right;
	public Node(int value) {
		this.value = value;
	}
	
	//返回当前节点的高度
	public int height() {
		return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
	}
	
	//1.获取左子树的高度
	public int leftHeight() {
		if(left == null) {
			return 0;
		}
		return left.height();
	}
	
	//2.获取右子树的高度
	public int rightHeight() {
		if(right == null) {
			return 0;
		}
		return right.height();
	}
	//向子树中添加节点
	public void add(Node node) {
		if(node == null) {
			return;
		}
		//判断传入的节点的值比当前子树的根节点的值大还是小
		//添加的节点比当前节点的值更小
		if(node.value < this.value) {
			//如果左节点为空
			if(this.left == null) {
				this.left = node;
			//如果左节点不为空	
			}else {
				this.left.add(node);
			}
		}else {
			//如果右节点为空
			if(this.right == null) {
				this.right = node;
			//如果右节点不为空
			}else {
				this.right.add(node);
			}
		}
		//查询是否平衡
		//1.进行右旋转
		if(leftHeight() - rightHeight() >= 2) {
			//双旋转(先左后右)
			if(left != null && left.leftHeight() < left.rightHeight()) {
				left.leftRotate();
				rightRotate();
			//单旋转
			}else {
				rightRotate();
			}
		}
		//2.左旋转
		if(leftHeight() - rightHeight() <= -2) {
			//双旋转(先右后左)
			if(right != null && right.leftHeight() > right.rightHeight()) {
				right.rightRotate();
				leftHeight();
			//单旋转
			}else {
				leftRotate();
			}
		}
	}
	
	//左旋转
	public void leftRotate() {
		//创建一个新的节点，值等于当前节点的值
		Node newLeft = new Node(value);
		//把新节点的左子树设置为当前节点的左子树
		newLeft.left = left;
		//把新节点的右子树设置为当前节点的右子树的左子树
		newLeft.right = right.left;
		//把当前节点的值设置为右子节点的值
		value = right.value;
		//把当前节点的右子树设置为右子树的右子树
		right = right.right;
		//把当前节点的左子树设置为新节点
		left = newLeft;
	}
	
	//右旋转
	public void rightRotate() {
		//创建一个新的节点，值等于当前节点的值
		Node newRight = new Node(value);
		//把新节点的右子树设置为当前节点的右子树
		newRight.right = right;
		//把新节点的左子树设置为当前节点的左子树的右子树
		newRight.left = left.right;
		//把当前节点的值设置为左子节点的值
		value = left.value;
		//把当前节点的左子树设置为左子树的左子树
		left = left.left;
		//把当前节点的右子树设置为新节点
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
	//查找节点
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
	
	//搜索父节点
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
