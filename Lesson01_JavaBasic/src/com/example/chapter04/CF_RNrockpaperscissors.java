package com.example.chapter04;

import java.util.Scanner;

public class CF_RNrockpaperscissors {

	public static void main(String[] args) {
		// ���������� ���� �����
		// �̳�����
		System.out.print("���� ���� �� ���ӿ� ���� ���� ȯ���մϴ�!\n�� �ո���� ����ּ���.\n");
		System.out.println("1. ����	2. ����	3. ��	�� ���� : ����");

		Scanner playerSelect = new Scanner(System.in);
		int selectedHand = playerSelect.nextInt();
		
		if(selectedHand == 1) {
			System.out.println("���� ����");
		}else if(selectedHand == 2) {
			System.out.println("���� ����");
		}else if(selectedHand == 3) {
			System.out.println("�� ����");
		}else {
			System.out.println("�����մϴ�.");
			return;
		}

		int cpuSelect = (int)(Math.random() * 10) % 3 + 1;
		
		if(cpuSelect == 1) {
			if(selectedHand == 1) {
				System.out.println("�����ϴ�! (CPU ���� vs �� ����)");
			}else if(selectedHand == 2) {
				System.out.println("�̰���ϴ�! (CPU ���� vs �� ����)");
			}else if(selectedHand == 3) {
				System.out.println("�����ϴ�! (CPU ���� vs �� ��)");
			}
		}
		
		if(cpuSelect == 2) {
			if(selectedHand == 1) {
				System.out.println("�����ϴ�! (CPU ���� vs �� ����)");
			}else if(selectedHand == 2) {
				System.out.println("�����ϴ�! (CPU ���� vs �� ����)");
			}else if(selectedHand == 3) {
				System.out.println("�̰���ϴ�! (CPU ���� vs �� ��)");
			}
		}
		
		if(cpuSelect == 3) {
			if(selectedHand == 1) {
				System.out.println("�̰���ϴ�! (CPU �� vs �� ����)");
			}else if(selectedHand == 2) {
				System.out.println("�����ϴ�! (CPU �� vs �� ����)");
			}else if(selectedHand == 3) {
				System.out.println("�����ϴ�! (CPU �� vs �� ��)");
			}
		}
		
		System.out.print("CPU ����\n(1: ����	2: ����	3: ��): ");
		System.out.println(cpuSelect);
		

	}// main

}// class
