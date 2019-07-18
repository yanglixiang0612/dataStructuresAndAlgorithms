package com.itheima.test1;

public class Test05_查找算法之线性查找 {

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,5,6,8,4,9,0};   //目标数组
		int target = 5;                            //目标元素
		int index = -1;                            //目标元素所在的下标
		for (int i = 0; i < arr.length; i++) {     //遍历数组
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		System.out.println("index:" + index);      //打印目标元素的下标
		
	}

}
