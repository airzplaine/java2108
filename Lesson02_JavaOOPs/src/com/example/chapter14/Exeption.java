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
			System.out.println("������ �߻��߽��ϴ�. ��õ����ּ���.");
			System.out.println("����");
			e.printStackTrace();
		}
		System.out.println("finish");

	}

}
