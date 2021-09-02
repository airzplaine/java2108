package com.example.chapter07;

public class BookArray {

	public static void main(String[] args) {
		Book[ ] library = new Book[5];
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("1234", "567");
		library[2] = new Book("아무것도", "아니다");
		library[3] = new Book("케인인님", "한판해요");
		library[4] = new Book("뭉탱이", "유링게숭");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}//for

	}//main

}//class
