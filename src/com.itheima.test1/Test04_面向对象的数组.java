package com.itheima.test1;

public class Test04_������������ {

	public static void main(String[] args) {
		//����һ���ɱ������
		MyArray ma = new MyArray();
		int size = ma.size();        //��ȡ����
		System.out.println(size);
		ma.add(20);
		ma.add(30);
		ma.add(40);
		ma.show();
		//ma.delete(0);
		ma.insert(2, 36);
		ma.show();
		ma.set(3, 46);      //�滻ָ��λ�õ�Ԫ��
		ma.show();
		System.out.println(ma.size());
		
	}
	
}
