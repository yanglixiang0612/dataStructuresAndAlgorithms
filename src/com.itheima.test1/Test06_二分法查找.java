package com.itheima.test1;

public class Test06_二分法查找 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};   //目标数组
		int target = 1;        //目标元素
		int begin = 0;         //记录开始位置
		int end = arr.length - 1;  //记录结束位置
		int mid = (begin + end)/2;   //记录中间位置
		int index = -1;      //记录目标位置
		while(true) {           //循环查找
			if(begin > end) {
				return;
			}
			if(arr[mid] == target) {         //判断中间的这个元素是不是要查找的元素
				index = mid;
				break;
			}else {                 //中间的这个元素不是要查找的元素
				if(arr[mid] > target) {
					end = mid - 1;
				}else {
					begin = mid + 1;
				}
				mid = (begin + end)/2;
			}
		}
		System.out.println("index:" + index);
		
	}

}
