package com.example.chapter06;

class BirthDay{
	int day;
	int month;
	int year;

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this); 	// this : �޸𸮿� ������ �ν��Ͻ� �ڱ� �ڽ��� ����. Ȥ�� ��ü �ڽ�
	}
	
	
	
	
}// class Birthday
// =========================== �� �̷��� ����⵵ ��

// ���ϸ�� ������ ThisEx class
public class ThisEx {

	public static void main(String[] args) {
		// Birthday Ŭ������ ��ü �����ϱ�
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		
		
	}// main

}// class ThisEx
