package com.example.chapter14;

public class Exeption {

	public static void main(String[] args) {
		int[] arr = new int[5];

		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i + 1;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("오류가 발생했습니다. 재시도해주세요.");
			System.out.println("뒈짓");
			e.printStackTrace();
		}
		System.out.println("finish");

	}

}
