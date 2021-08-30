package com.example.chapter05;

public class Student1_Test {

	public static void main(String[] args) {
		// Student1 클래스로부터 객체를 생성하기
		// 객체 생성 : 
		// new 클래스생성자( );
		// Student1 클래스의 객체↓를 하나 생성하라.
		Student1 hong = new Student1(); // <- 이게 클래스 생성자(constructor). 클래스이름()
		//객체참조변수↑
//		System.out.println(hong);
		hong.setStudentName("홍길동");
		hong.setGrade(1);
		hong.setStudentID(1001);
		hong.setAddress("청주시 청원구");
		
		System.out.println(hong.getStudentID());
		hong.showStudentInfo();
		
		System.out.println("===============");
		Student1 park = new Student1(2021, "박명수", 1, "청주시 흥덕구");
		park.showStudentInfo();
		
		
//		Student1 kim = new Student1();
//		kim.studentName = "김삿갓";
//		kim.address = "청주시 흥덕구";
//		kim.showStudentInfo();

	}

}
