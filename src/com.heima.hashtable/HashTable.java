package com.heima.hashtable;

import java.util.Arrays;

public class HashTable {
	private StuInfo[] data = new StuInfo[100];
	//向散列表中添加元素
	public void put(StuInfo stuInfo) {
		//调用散列函数获取存储位置
		int index = stuInfo.hashCode();
		//添加元素
		data[index] = stuInfo;
	}
	
	//取出元素
	public StuInfo get(StuInfo stuInfo) {
		return data[stuInfo.hashCode()];
	}

	@Override
	public String toString() {
		return "HashTable [data=" + Arrays.toString(data) + "]";
	}
	
}
