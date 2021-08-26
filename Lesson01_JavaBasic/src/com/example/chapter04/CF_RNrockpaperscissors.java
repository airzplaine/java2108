package com.example.chapter04;

import java.util.Scanner;

public class CF_RNrockpaperscissors {

	public static void main(String[] args) {
		// 가위바위보 게임 만들기
		// 겁나쉽다
		System.out.print("가위 바위 보 게임에 오신 것을 환영합니다!\n낼 손모양을 골라주세요.\n");
		System.out.println("1. 가위	2. 바위	3. 보	외 숫자 : 종료");

		Scanner playerSelect = new Scanner(System.in);
		int selectedHand = playerSelect.nextInt();
		
		if(selectedHand == 1) {
			System.out.println("가위 선택");
		}else if(selectedHand == 2) {
			System.out.println("바위 선택");
		}else if(selectedHand == 3) {
			System.out.println("보 선택");
		}else {
			System.out.println("종료합니다.");
			return;
		}

		int cpuSelect = (int)(Math.random() * 10) % 3 + 1;
		
		if(cpuSelect == 1) {
			if(selectedHand == 1) {
				System.out.println("비겼습니다! (CPU 가위 vs 내 가위)");
			}else if(selectedHand == 2) {
				System.out.println("이겼습니다! (CPU 가위 vs 내 바위)");
			}else if(selectedHand == 3) {
				System.out.println("졌습니다! (CPU 가위 vs 내 보)");
			}
		}
		
		if(cpuSelect == 2) {
			if(selectedHand == 1) {
				System.out.println("졌습니다! (CPU 바위 vs 내 가위)");
			}else if(selectedHand == 2) {
				System.out.println("비겼습니다! (CPU 바위 vs 내 바위)");
			}else if(selectedHand == 3) {
				System.out.println("이겼습니다! (CPU 바위 vs 내 보)");
			}
		}
		
		if(cpuSelect == 3) {
			if(selectedHand == 1) {
				System.out.println("이겼습니다! (CPU 보 vs 내 가위)");
			}else if(selectedHand == 2) {
				System.out.println("졌습니다! (CPU 보 vs 내 바위)");
			}else if(selectedHand == 3) {
				System.out.println("비겼습니다! (CPU 보 vs 내 보)");
			}
		}
		
		System.out.print("CPU 선택\n(1: 가위	2: 바위	3: 보): ");
		System.out.println(cpuSelect);
		

	}// main

}// class
