package com.heima.hashtable;

import java.util.Arrays;

public class HashTable {
	private StuInfo[] data = new StuInfo[100];
	//��ɢ�б������Ԫ��
	public void put(StuInfo stuInfo) {
		//����ɢ�к�����ȡ�洢λ��
		int index = stuInfo.hashCode();
		//���Ԫ��
		data[index] = stuInfo;
	}
	
	//ȡ��Ԫ��
	public StuInfo get(StuInfo stuInfo) {
		return data[stuInfo.hashCode()];
	}

	@Override
	public String toString() {
		return "HashTable [data=" + Arrays.toString(data) + "]";
	}
	
}
