package com.example.chapter04;

import java.util.Scanner;

public class CalcCircleArea {

	public static void main(String[] args) {
		// PSEUDO Code
		// ��ĳ�� �Էº��� ����, ���̰� �������
		final double PI = 3.141592;
		Scanner input = new Scanner(System.in);
		// �������� �Է��ش޶�� �޽��� ���
		System.out.println("���� �������� �Է����ּ���.");
		// �������� �Է¹���
		int circRad = input.nextInt();
		// ���� ���� ���
		double radiCirc = circRad * circRad * PI;
		// ���� ��� ���
		System.out.printf("�������� %d�� ���� ���̴� %f�̴�.", circRad, radiCirc);

	}

}
