package com.example.chapter04;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		//Iterative / Loop (�ݺ���)
				
//		System.out.println("Hello");
		
		// for ���� ��! �̿��� ���
//		for(int cnt = 1; cnt <= 10; cnt++) {
//			System.out.println("Hello");
//		}
		
		/* ���
		for(����� �ʱ��; �ݺ����� ���ǽ�; ����� ������) {
			�ݺ��� �ڵ��;
		}
		*/
		
//		for(int count = 1; count <= 10; count++) {
//			System.out.println(count);
//		}
		
		// 1���� 10������ �հ踦 ���ϼ���
		
//		int fin = 0;
//		for(int counter = 1; counter <= 10; counter++) {
//			fin += counter;
//		}
		
//		System.out.println(fin);
		
		// while ���� ����
		
//		int sum = 0;
//		int number = 1;
//		while(number <= 10) {
//			sum += number;
//			number++;
//		}
//		System.out.println(sum);
//		
		
		// while ��Ʈ variation ����
		// do{} while();
		Scanner input = new Scanner(System.in);
		int jobNum = 999;
		do {
			System.out.println("1. �ڷ� ����");
			System.out.println("2. �ڷ� ��ȸ");
			System.out.println("3. �ڷ� ����");
			System.out.println("4. �ڷ� ����");
			System.out.println("0. ������");
			
			System.out.println("���Ͻô� �۾��� �������ּ���");
			jobNum = input.nextInt();
			System.out.println("���õ� ��ȣ : " + jobNum);
		}while(jobNum != 0);
		
		System.out.println("RIP");
		
		
	}

}
