package com.example.chapter04;

import java.util.Scanner;

public class CF_Scoring {

	public static void main(String[] args) {
		// ������ �Է¹޾� 90 �̻��� ��� A
		// 80 �̻��̸� B��
		// 70 �̻��̸� C��
		// 60 �̻��̸� D��
		// ������ F
		
		/*
		 * if(����) {}
		 * else if(����2) {}
		 * else if(����n) {}
		 * else {}
		 */ 	
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		int score = input.nextInt();
		if(score >=90) {
			System.out.println("A����Դϴ�.");
		}else if(score >= 80) {
			System.out.println("B����Դϴ�.");
		}else if(score >= 70) {
			System.out.println("C����Դϴ�.");
		}else if(score >= 60) {
			System.out.println("D����Դϴ�.");
		}else {
			System.out.println("F����Դϴ�. ����̽ʴϱ�");
		}
		
		input.close();
		System.out.println("Ȯ�οϷ�.");

	}

}