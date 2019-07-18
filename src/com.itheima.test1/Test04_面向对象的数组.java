package com.itheima.test1;

public class Test04_面向对象的数组 {

	public static void main(String[] args) {
		//创建一个可变的数组
		MyArray ma = new MyArray();
		int size = ma.size();        //获取长度
		System.out.println(size);
		ma.add(20);
		ma.add(30);
		ma.add(40);
		ma.show();
		//ma.delete(0);
		ma.insert(2, 36);
		ma.show();
		ma.set(3, 46);      //替换指定位置的元素
		ma.show();
		System.out.println(ma.size());
		
	}
	
}
