package com.itheima.sort;

import java.util.Arrays;

import com.itheima.test1.MyQueue;

public class Test08_基数排序之队列实现 {

	public static void main(String[] args) {
		int[] arr = new int[] {23,6,189,45,9,287,56,1,789,34,65,652,5};
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void radixSort(int[] arr) {
		int max = Integer.MIN_VALUE;                         //存数组中最大的数
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		int maxLength = (max + "").length();                 //计算最大数字是几位数
		MyQueue[] temp = new MyQueue[10];                    //用于临时存储数据的队列的数组
		for (int i = 0; i < temp.length; i++) {
			temp[i] = new MyQueue();                         //为队列数组赋值
		}
		for (int i = 0,n = 1; i < maxLength; i++,n*=10) {    //根据最大长度的数决定比较的次数
			for (int j = 0; j < arr.length; j++) {
				int ys = arr[j]/n%10;                        //计算余数
				temp[ys].add(arr[j]);                        //把当前遍历的数据存入指定的队列中
			}
			int index = 0;                                   //记录取的元素需要放的位置
			for (int k = 0; k < temp.length; k++) {          //把所有队列中的数字取出来
				while(!temp[k].isEmpty()) {                  //当前遍历的队列不为空
					arr[index] = temp[k].poll();             //取出元素
					index++;                                 //记录下一个位置
				}
			}
		}
	}

}
