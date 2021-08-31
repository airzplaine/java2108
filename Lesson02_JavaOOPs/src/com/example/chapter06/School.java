package com.example.chapter06;

public class School {
	// 2. 클래스 내부에서 static으로 유일한 인스턴스를 생성한다.
	private static School instance = new School();
	// 1. 생성자의 access modifier를 private으로 만든다.
	private School() {
		// None operation
	}
	
	// 3. 외부에서 이 인스턴스를 참조할 수 있도록 public 메서드를 하나 만들어준다.
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

}// main
