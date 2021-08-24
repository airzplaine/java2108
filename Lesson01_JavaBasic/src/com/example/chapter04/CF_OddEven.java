package com.example.chapter04;

import java.util.Scanner;

public class CF_OddEven {

	public static void main(String[] args) {
		// 홀짝구분
		// 스캐너로 숫자를 입력받음
		Scanner input = new Scanner(System.in);
		// 입력하라는 메시지 출력
		System.out.println("숫자를 입력해주세요.");
		// 숫자 입력
		int num = input.nextInt();
		// 입력된 숫자가 짝수이면 짝수출력
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else { // 아니면 홀수출력
			System.out.println("홀수입니다.");
		}
		
		// 스캐너 반납
		input.close();
		System.out.println("end");

	}// end main

}// end class
