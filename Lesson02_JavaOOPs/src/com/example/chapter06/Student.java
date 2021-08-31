package com.example.chapter06;

public class Student {
	public String studentName;
	public int grade;
	public int poketMoney;
	static int classMoney = 0;
	
	// constructor
	public Student(String studentName, int poketMoney) {
		this.studentName = studentName;
		this.poketMoney = poketMoney;
	}
	
	// 버스를 탐
	public void takeBus(Bus bus) {
		bus.take(1500);
		this.poketMoney -= 1500;
	}
	
	public void takeOffBus(Bus bus) {
		bus.takeOff(bus.busNum);
	}
	
	public void donate(int poketMoney) {
		classMoney += poketMoney;
		this.poketMoney -= poketMoney;
	}
	
	
	// 학생의 현재 금액 확인하기
	public void showInfo() {
		System.out.println(studentName + "님의 현재 잔액은 " + poketMoney + "원입니다.");
	}
	
	public void showClassMoney() {
		System.out.println(studentName + "님의 학급 학급비 잔액은 " + classMoney + "원입니다.");
	}
	
}
