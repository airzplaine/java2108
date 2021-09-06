package com.example.chapter09;

//public class Test { <- 일반 클래스 디파인
//abstract 메서드를 하나라도 포함하고 있으면 해당 클래스는 abstract 클래스가 된다.
public abstract class Test { 
	// 구체적인 구현은 하위 클래스에게 위임하기 위함
	abstract int test1(int a, int b); // abstract 메서드
	int test2(int a, int b) {
		return a + b;
	}

}
