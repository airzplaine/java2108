package com.example.chapter07;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 선언과 초기화, 인덱스(첨자변수)의 사용
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		for(int i = 0; i < num.length; i++) {
			// num.length를 넣어서 ↑ 배열의 크기를 가져올 수 있다.
			System.out.println(num[i]);
		}

		System.out.println("finished");
		

	}

}
