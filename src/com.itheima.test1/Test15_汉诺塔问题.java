package com.itheima.test1;

public class Test15_��ŵ������ {

	public static void main(String[] args) {
		hanoi(20,'A','B','C');
		
	}
	/**
	 * @param n ����N������
	 * @param from ��ʼ������
	 * @param in �м������
	 * @param to Ŀ������
	 * �����ж��ٸ����ӣ�����Ϊֻ���������������е����Ӻ�������һ������
	 */

	public static void hanoi(int n,char from,char in,char to) {
		//ֻ��һ������
		if(n == 1) {
			System.out.println("��1�����Ӵ�" + from + "�Ƶ�" + to);
		}else {
			hanoi(n-1, from, to, in);   //�ƶ��������е����ӵ��м�λ��
			System.out.println("��" + n + "�����Ӵ�" + from + "�Ƶ�" + to);//�ƶ����������
			hanoi(n-1, in, from, to);  //���������е����Ӵ��м��Ƶ�Ŀ��λ��
			
		}
	}
	

}
