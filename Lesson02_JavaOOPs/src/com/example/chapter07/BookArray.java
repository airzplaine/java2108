package com.example.chapter07;

public class BookArray {

	public static void main(String[] args) {
		Book[ ] library = new Book[5];
		
		library[0] = new Book("�¹���", "������");
		library[1] = new Book("1234", "567");
		library[2] = new Book("�ƹ��͵�", "�ƴϴ�");
		library[3] = new Book("�����δ�", "�����ؿ�");
		library[4] = new Book("������", "�����Լ�");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}//for

	}//main

}//class
