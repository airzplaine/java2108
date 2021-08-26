package com.example.chapter04;

import java.util.Scanner;

public class CF_SwitchCase {

	public static void main(String[] args) {
		// 성적을 입력받아 90 이상일 경우 A
				// 80 이상이면 B를
				// 70 이상이면 C를
				// 60 이상이면 D를
				// 그이하 F
				
				/*
				 * switch(식) {
				 *     case 90~100:
				 *     case 80~89 :
				 *     ...
				 *     default:
				 *         F
				 * }
				 */ 	
				
				Scanner input = new Scanner(System.in);
				System.out.println("점수를 입력하세요.");
				
				int score = input.nextInt();
				switch (score / 10) {
				case 10:
				case 9:
					System.out.println("A등급입니다.");
					break;
				case 8:
					System.out.println("B등급입니다.");
					break;
				case 7:
					System.out.println("C등급입니다.");
					break;
				case 6:
					System.out.println("D등급입니다.");
					break;
				default:
					System.out.println("F등급입니다. 사람인가");
					break;
				}// switch
				
				System.out.println("조회 완료");
				

	}// main

}
