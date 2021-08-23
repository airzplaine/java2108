package com.example.chapter02;

public class Variable4_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A'; // 작은따옴표로 묶인 것은 문자다.
		String yourStr = "Apple"; // 큰따옴표로 붂인 것은 문자열이다
		
		System.out.println(myChar); // char A를 출력
		System.out.println(yourStr); // String A를 출력
		
		// char 타입 변수는 ASCII로 출력 가능하다.
		System.out.println((int)myChar); // 65
		
		int newChar = 66;
		// ASCII 코드값을 문자로 출력할 수 있다.
		System.out.println((char)newChar); // B
		
		// 영어 알파벳 A ~ Z 까지 ASCII를 이용하여 출력
		for(int ch = 65; ch < 91;ch++) {
			System.out.println((char)ch);
		}
		
		char ch1 = '한';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
