package com.example.chapter06;

public class School {
	// 2. Ŭ���� ���ο��� static���� ������ �ν��Ͻ��� �����Ѵ�.
	private static School instance = new School();
	// 1. �������� access modifier�� private���� �����.
	private School() {
		// None operation
	}
	
	// 3. �ܺο��� �� �ν��Ͻ��� ������ �� �ֵ��� public �޼��带 �ϳ� ������ش�.
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

}// main
