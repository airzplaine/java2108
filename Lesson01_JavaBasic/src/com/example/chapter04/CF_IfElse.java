package com.example.chapter04;

import java.util.Scanner;

public class CF_IfElse {

	public static void main(String[] args) {
		// if else 제어구문 예제
		// if 조건식 { } else { }
		//준비
		Scanner input = new Scanner(System.in);
		// 생년 입력하라는 메시지 출력
		System.out.println("출생년도를 입력하세요.");
		// 생년 입력
		int birthYear = input.nextInt();
		// 나이 계산
		int age = 2021 - birthYear;
		// 계산된 나이를 20보다 작으면 미성년처리
		if(age < 20) { // 미성년임
			System.out.println("미성년은 음주가 불가능합니다.");
			System.out.println("가세요");
		}else { // 아니라면 성년처리
			System.out.println("어서옵쇼");
			System.out.println("술담배맥주담배다팝니다마시세오");
		}
		
		System.out.println("end");
	}

}
