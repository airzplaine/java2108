package com.example.chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생이 버스를 타는 실 세계를 표현
		// 학생 객체 생성
		
//		Student.classMoney = 100000;
//		
//		Student hong = new Student("홍길동", 10000);
//		Student seong = new Student("성춘향", 50000);
//		
//		
//		// 홍의 개인돈, 학급비확인
//		hong.showInfo();
//		hong.showClassMoney();
//		// 홍 도네
//		hong.donate(1000);
//		// 홍의 개인돈 성의 개인돈, 학급비 확인
//		hong.showInfo();
//		hong.showClassMoney();
//		seong.showClassMoney();
//		
//		// 성 도네
//		seong.donate(20000);
//		// 성의 개인돈, 홍의 개인돈, 학급비 확인
//		seong.showInfo();
//		seong.showClassMoney();
//		hong.showClassMoney();
		
		
		
//		// 두 학생 정보 확인
//		hong.showInfo();
//		seong.showInfo();
//		// 버스 객체 생성
//		Bus bus777 = new Bus(777);
//		// 버스 정보 확인
//		bus777.showInfo();
//		// 두 학생이 버스를 탐
//		hong.takeBus(bus777);
//		seong.takeBus(bus777);
//		// 두 학생과 버스의 정보 확인
//		hong.showInfo();
//		seong.showInfo();
//		bus777.showInfo();
//		// 한 학생이 버스를 내림
//		hong.takeOffBus(bus777);
//		// 버스를 내린 학생과 버스의 정보 확인
//		hong.showInfo();
//		bus777.showInfo();
		
		
		// 싱글톤 패턴
		
		School mySchool = School.getInstance();
		School yourSchool = School.getInstance();
		School hisSchool = School.getInstance();
		
		System.out.println(mySchool);
		System.out.println(yourSchool);
		System.out.println(hisSchool);
		
		
		

	}

}
