package com.example.chapter04;

public class CF_RandomNum {

	public static void main(String[] args) {
		// random number �����ϱ�
		// Math Ŭ������ random() ���
		// random() �Լ��� 0 ~ 1 �̸��� �Ǽ����·� ������ �����Ѵ�.
//		double rnum = Math.random() * 10;
		// 0 ~ 9������ ������ ������ ���ڸ� �����Ѵ�.
//		int rnum = (int)(Math.random() * 100);
		int rnum = (int)(Math.random() * 100) % 45 + 1;
		System.out.println(rnum);

	}

}
