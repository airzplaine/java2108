package com.example.chapter04;

import java.util.Scanner;

public class CF_Scoring {

	public static void main(String[] args) {
		// 성적을 입력받아 90 이상일 경우 A
		// 80 이상이면 B를
		// 70 이상이면 C를
		// 60 이상이면 D를
		// 그이하 F
		
		/*
		 * if(조건) {}
		 * else if(조건2) {}
		 * else if(조건n) {}
		 * else {}
		 */ 	
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		int score = input.nextInt();
		if(score >=90) {
			System.out.println("A등급입니다.");
		}else if(score >= 80) {
			System.out.println("B등급입니다.");
		}else if(score >= 70) {
			System.out.println("C등급입니다.");
		}else if(score >= 60) {
			System.out.println("D등급입니다.");
		}else {
			System.out.println("F등급입니다. 사람이십니까");
		}
		
		input.close();
		System.out.println("확인완료.");

	}

}
