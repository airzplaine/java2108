package com.example.chapter02;

public class Variable4_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A'; // ��������ǥ�� ���� ���� ���ڴ�.
		String yourStr = "Apple"; // ū����ǥ�� ���� ���� ���ڿ��̴�
		
		System.out.println(myChar); // char A�� ���
		System.out.println(yourStr); // String A�� ���
		
		// char Ÿ�� ������ ASCII�� ��� �����ϴ�.
		System.out.println((int)myChar); // 65
		
		int newChar = 66;
		// ASCII �ڵ尪�� ���ڷ� ����� �� �ִ�.
		System.out.println((char)newChar); // B
		
		// ���� ���ĺ� A ~ Z ���� ASCII�� �̿��Ͽ� ���
		for(int ch = 65; ch < 91;ch++) {
			System.out.println((char)ch);
		}
		
		char ch1 = '��';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
