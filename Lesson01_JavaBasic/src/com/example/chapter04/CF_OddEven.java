package com.example.chapter04;

import java.util.Scanner;

public class CF_OddEven {

	public static void main(String[] args) {
		// Ȧ¦����
		// ��ĳ�ʷ� ���ڸ� �Է¹���
		Scanner input = new Scanner(System.in);
		// �Է��϶�� �޽��� ���
		System.out.println("���ڸ� �Է����ּ���.");
		// ���� �Է�
		int num = input.nextInt();
		// �Էµ� ���ڰ� ¦���̸� ¦�����
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else { // �ƴϸ� Ȧ�����
			System.out.println("Ȧ���Դϴ�.");
		}
		
		// ��ĳ�� �ݳ�
		input.close();
		System.out.println("end");

	}// end main

}// end class
