package com.example.chapter06;

class BirthDay{
	int day;
	int month;
	int year;

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this); 	// this : 메모리에 형성된 인스턴스 자기 자신을 뜻함. 혹은 객체 자신
	}
	
	
	
	
}// class Birthday
// =========================== ← 이런거 만들기도 함

// 파일명과 동일한 ThisEx class
public class ThisEx {

	public static void main(String[] args) {
		// Birthday 클래스로 객체 생성하기
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		
		
	}// main

}// class ThisEx
