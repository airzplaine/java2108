package com.example.chapter05;

public class Student1_Test {

	public static void main(String[] args) {
		// Student1 Ŭ�����κ��� ��ü�� �����ϱ�
		// ��ü ���� : 
		// new Ŭ����������( );
		// Student1 Ŭ������ ��ü�鸦 �ϳ� �����϶�.
		Student1 hong = new Student1(); // <- �̰� Ŭ���� ������(constructor). Ŭ�����̸�()
		//��ü����������
//		System.out.println(hong);
		hong.setStudentName("ȫ�浿");
		hong.setGrade(1);
		hong.setStudentID(1001);
		hong.setAddress("û�ֽ� û����");
		
		System.out.println(hong.getStudentID());
		hong.showStudentInfo();
		
		System.out.println("===============");
		Student1 park = new Student1(2021, "�ڸ��", 1, "û�ֽ� �����");
		park.showStudentInfo();
		
		
//		Student1 kim = new Student1();
//		kim.studentName = "���";
//		kim.address = "û�ֽ� �����";
//		kim.showStudentInfo();

	}

}
