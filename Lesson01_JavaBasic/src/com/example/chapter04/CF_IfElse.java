package com.example.chapter04;

import java.util.Scanner;

public class CF_IfElse {

	public static void main(String[] args) {
		// if else ����� ����
		// if ���ǽ� { } else { }
		//�غ�
		Scanner input = new Scanner(System.in);
		// ���� �Է��϶�� �޽��� ���
		System.out.println("����⵵�� �Է��ϼ���.");
		// ���� �Է�
		int birthYear = input.nextInt();
		// ���� ���
		int age = 2021 - birthYear;
		// ���� ���̸� 20���� ������ �̼���ó��
		if(age < 20) { // �̼�����
			System.out.println("�̼����� ���ְ� �Ұ����մϴ�.");
			System.out.println("������");
		}else { // �ƴ϶�� ����ó��
			System.out.println("��ɼ�");
			System.out.println("�������ִ����˴ϴٸ��ü���");
		}
		
		System.out.println("end");
	}

}
