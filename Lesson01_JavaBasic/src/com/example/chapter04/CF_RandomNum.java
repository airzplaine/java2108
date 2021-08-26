package com.example.chapter04;

public class CF_RandomNum {

	public static void main(String[] args) {
		// random number 생성하기
		// Math 클래스의 random() 사용
		// random() 함수는 0 ~ 1 미만의 실수형태로 난수를 생성한다.
//		double rnum = Math.random() * 10;
		// 0 ~ 9까지의 임의의 정수형 숫자를 생성한다.
//		int rnum = (int)(Math.random() * 100);
		int rnum = (int)(Math.random() * 100) % 45 + 1;
		System.out.println(rnum);

	}

}
