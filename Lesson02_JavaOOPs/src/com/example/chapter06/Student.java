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
	
	// ������ Ž
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
	
	
	// �л��� ���� �ݾ� Ȯ���ϱ�
	public void showInfo() {
		System.out.println(studentName + "���� ���� �ܾ��� " + poketMoney + "���Դϴ�.");
	}
	
	public void showClassMoney() {
		System.out.println(studentName + "���� �б� �б޺� �ܾ��� " + classMoney + "���Դϴ�.");
	}
	
}
