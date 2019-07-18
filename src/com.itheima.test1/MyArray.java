package com.itheima.test1;

import java.util.Arrays;

//面向对象的数组
public class MyArray {                              
	//用于存储数据的数组
	private int[] elements;
	public MyArray() {
		elements = new int[0];
	}
	
	public int size() {                                //获取数组长度的方法
		return elements.length;
	}
	
	   
	public void add(int element) {                     //往数组末尾添加一个元素
		int[] newArr = new int[elements.length + 1];   //创建一个新的数组
		for (int i = 0; i < elements.length; i++) {    //把原数组中的元素复制到新数组中
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;             //把添加的元素放入新数组中
		elements = newArr;                             //使用新数组替换旧数组
	}
	
	public void show() {                               //打印所有元素到控制台
		System.out.println(Arrays.toString(elements));
	} 
	
	public void delete(int index) {                    //删除数组中的元素
		if(index < 0 || index > elements.length - 1) { //判断下标是否越界
			throw new RuntimeException("下标越界");
		}
		int[] newArr = new int[elements.length - 1];   //创建一个新的数组，长度为原数组的长度-1
		for (int i = 0; i < newArr.length; i++) {      //复制原有数据到新数组
			if(i < index) {                            //想要删除的元素前面的元素
				newArr[i] = elements[i];
			}else {                                    //想要删除的元素后面的元素
				newArr[i] = elements[i + 1];
			}
		}
		elements = newArr;                             //新数组替换旧数组
	}
	
	public int get(int index) {                        //取出指定位置的元素
		if(index < 0 || index > elements.length - 1) { //判断下标是否越界
			throw new RuntimeException("下标越界");
		}
		return elements[index];
	}
	
	public void insert(int index,int element) {        //插入一个元素到指定位置
		int[] newArr = new int[elements.length + 1];   //创建一个新数组
		for (int i = 0; i < elements.length; i++) {    //将原数组中的元素放入新数组中
			if(i < index) {                            //目标位置之前的元素
				newArr[i] = elements[i];
			}else {                                    //目标位置之后的元素  
				newArr[i + 1] = elements[i];
			}
		}
		newArr[index] = element;                      //插入新的元素
		elements = newArr;                            //新数组替换旧数组
	}
	
	public void set(int index,int element) {          //替换指定位置的元素
		if(index < 0 || index > elements.length - 1) { //判断下标是否越界
			throw new RuntimeException("下标越界");
		}
		elements[index] = element;
	}
	
	//线性查找
	public int search(int target) {
		for (int i = 0; i < elements.length; i++) {     //遍历数组
			if(elements[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	//二分查找
	public int binarySearch(int target) {
		int begin = 0;         //记录开始位置
		int end = elements.length - 1;  //记录结束位置
		int mid = (begin + end)/2;   //记录中间位置
		while(true) {           //循环查找
			if(begin > end) {
				return -1;
			}
			if(elements[mid] == target) {         //判断中间的这个元素是不是要查找的元素
				return mid;
			}else {                 //中间的这个元素不是要查找的元素
				if(elements[mid] > target) {
					end = mid - 1;
				}else {
					begin = mid + 1;
				}
				mid = (begin + end)/2;
			}
		}
	}
}
