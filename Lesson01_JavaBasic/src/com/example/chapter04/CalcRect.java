package com.example.chapter04;

import java.util.Scanner;

public class CalcRect {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("������ ���̸� �� �ּ���.");
		
		int garo = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("������ ���̸� �� �ּ���.");
		
		int sero = input2.nextInt();
		int calcRact = garo * sero;
		System.out.printf("���� %d, ���� %d�� �簢���� ���̴� %d�̴�.", garo, sero, calcRact);

	}

}

// PSEUDO Code / �ǻ� �ڵ� :
// ���� �ذ��� ������ �ϻ��� �� �̿��Ͽ� ����� ��.
// �Է��� �ޱ� ���� ��ĳ�� ���� ����

// ���θ� �Է��϶�� �޽��� ���

// ���θ� �Է¹���

// ���θ� �Է��϶�� �޽��� ���

// ���θ� �Է¹���

// ���� = ���� * ����

// ���� ���̸� ���