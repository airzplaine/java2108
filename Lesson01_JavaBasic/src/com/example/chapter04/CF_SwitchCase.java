package com.example.chapter04;

import java.util.Scanner;

public class CF_SwitchCase {

	public static void main(String[] args) {
		// ������ �Է¹޾� 90 �̻��� ��� A
				// 80 �̻��̸� B��
				// 70 �̻��̸� C��
				// 60 �̻��̸� D��
				// ������ F
				
				/*
				 * switch(��) {
				 *     case 90~100:
				 *     case 80~89 :
				 *     ...
				 *     default:
				 *         F
				 * }
				 */ 	
				
				Scanner input = new Scanner(System.in);
				System.out.println("������ �Է��ϼ���.");
				
				int score = input.nextInt();
				switch (score / 10) {
				case 10:
				case 9:
					System.out.println("A����Դϴ�.");
					break;
				case 8:
					System.out.println("B����Դϴ�.");
					break;
				case 7:
					System.out.println("C����Դϴ�.");
					break;
				case 6:
					System.out.println("D����Դϴ�.");
					break;
				default:
					System.out.println("F����Դϴ�. ����ΰ�");
					break;
				}// switch
				
				System.out.println("��ȸ �Ϸ�");
				

	}// main

}
