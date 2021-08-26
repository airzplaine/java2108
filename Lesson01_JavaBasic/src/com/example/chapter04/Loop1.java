package com.example.chapter04;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		//Iterative / Loop (반복문)
				
//		System.out.println("Hello");
		
		// for 구문 를! 이용한 방법
//		for(int cnt = 1; cnt <= 10; cnt++) {
//			System.out.println("Hello");
//		}
		
		/* 용례
		for(제어변수 초기식; 반복종료 조건식; 제어변수 증감식) {
			반복할 코드블럭;
		}
		*/
		
//		for(int count = 1; count <= 10; count++) {
//			System.out.println(count);
//		}
		
		// 1부터 10까지의 합계를 구하세요
		
//		int fin = 0;
//		for(int counter = 1; counter <= 10; counter++) {
//			fin += counter;
//		}
		
//		System.out.println(fin);
		
		// while 루프 제어
		
//		int sum = 0;
//		int number = 1;
//		while(number <= 10) {
//			sum += number;
//			number++;
//		}
//		System.out.println(sum);
//		
		
		// while 루트 variation 변형
		// do{} while();
		Scanner input = new Scanner(System.in);
		int jobNum = 999;
		do {
			System.out.println("1. 자료 삽입");
			System.out.println("2. 자료 조회");
			System.out.println("3. 자료 수정");
			System.out.println("4. 자료 삭제");
			System.out.println("0. 나가기");
			
			System.out.println("원하시는 작업을 선택해주세요");
			jobNum = input.nextInt();
			System.out.println("선택된 번호 : " + jobNum);
		}while(jobNum != 0);
		
		System.out.println("RIP");
		
		
	}

}
