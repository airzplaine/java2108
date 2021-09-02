package com.example.chapter07;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList ������ Ȱ��
		// ArrayList<E> �迭�̸� = new ArrayList<E>();
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�¹���", "������"));
		library.add(new Book("�����̷� �ִٰ�", "�����Լ�"));
		library.add(new Book("�����δ�", "�����ؿ�"));
		library.add(new Book("������", "�װ��ʸ�"));
		library.add(new Book("�����", "�������丮"));
		
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
