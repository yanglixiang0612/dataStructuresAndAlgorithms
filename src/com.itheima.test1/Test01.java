package com.itheima.test1;

public class Test01 {

	public static void main(String[] args) {
		int total = 0;
		int end = 100;
		//1.ʹ��forѭ������
		/*for (int i = 1; i <= end; i++) {
			total += i;
		}*/
		
		//2.ֱ�Ӽ���
		total = (1 + end)*end/2;    
		
		//ע���������ַ�����Ϊ�㷨���㷨û����õģ�ֻ�����ʺϵġ�
		
		System.out.println(total);
	}

}
