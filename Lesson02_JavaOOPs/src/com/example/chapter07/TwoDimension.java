package com.example.chapter07;

public class TwoDimension {

	public static void main(String[] args) {
		// 2차원 배열 다루기
		int[][] arr = {{1, 2, 3, 0}, {4, 5, 6, 1}, {7, 8, 9, 2}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
