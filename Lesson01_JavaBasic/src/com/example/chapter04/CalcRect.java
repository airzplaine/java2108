package com.example.chapter04;

import java.util.Scanner;

public class CalcRect {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("가로의 길이를 써 주세요.");
		
		int garo = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("세로의 길이를 써 주세요.");
		
		int sero = input2.nextInt();
		int calcRact = garo * sero;
		System.out.printf("가로 %d, 세로 %d인 사각형의 넓이는 %d이다.", garo, sero, calcRact);

	}

}

// PSEUDO Code / 의사 코드 :
// 문제 해결의 과정을 일상의 언어를 이용하여 기술한 것.
// 입력을 받기 위한 스캐너 변수 생성

// 가로를 입력하라는 메시지 출력

// 가로를 입력받음

// 세로를 입력하라는 메시지 출력

// 세로를 입력받음

// 넓이 = 가로 * 세로

// 계산된 넓이를 출력