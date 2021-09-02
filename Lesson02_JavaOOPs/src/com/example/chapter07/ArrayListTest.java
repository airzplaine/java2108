package com.example.chapter07;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList 생성과 활용
		// ArrayList<E> 배열이름 = new ArrayList<E>();
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("뭉탱이로 있다가", "유링게숭"));
		library.add(new Book("케인인님", "한판해요"));
		library.add(new Book("언젠가", "그가너를"));
		library.add(new Book("어린왕자", "생텍쥐페리"));
		
//		for(int i = 0; i < library.size(); i++) {
//			Book book = library.get(i);
//			book.showBookInfo();
//		}
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		library.remove(1);
		System.out.println("===============");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
	}

}
