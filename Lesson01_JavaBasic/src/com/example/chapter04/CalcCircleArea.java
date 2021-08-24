package com.example.chapter04;

import java.util.Scanner;

public class CalcCircleArea {

	public static void main(String[] args) {
		// PSEUDO Code
		// 스캐너 입력변수 선언, 파이값 상수선언
		final double PI = 3.141592;
		Scanner input = new Scanner(System.in);
		// 반지름을 입력해달라는 메시지 출력
		System.out.println("원의 반지름을 입력해주세요.");
		// 반지름을 입력받음
		int circRad = input.nextInt();
		// 원의 넓이 계산
		double radiCirc = circRad * circRad * PI;
		// 계산된 결과 출력
		System.out.printf("반지름이 %d인 원의 넓이는 %f이다.", circRad, radiCirc);

	}

}
