package com.example.chapter08;

public class KoreaMart {

	public static void main(String[] args) {
		// �ڸ��Ƹ�Ʈ ����! �����δ԰� �����̴��� �����Լ�...
		Customer customerMoong = new Customer();
		customerMoong.setCustomerID(1001);
		customerMoong.setCustomerName("������");
		customerMoong.setBonusPoint(1000);
		System.out.println(customerMoong.showCustomerInfo());
		
		
		Customer customerKain = new VIPCustomer();
		customerKain.setCustomerID(2001);
		customerKain.setCustomerName("������");
		customerKain.setBonusPoint(1000);
		System.out.println(customerKain.showCustomerInfo());
		
		Customer customerYu = new GoldCustomer(3001, "�����Լ�");
		customerYu.setBonusPoint(1000);
		System.out.println(customerYu.showCustomerInfo());
		
		System.out.println(customerMoong.calcPrice(10000));
		System.out.println(customerKain.calcPrice(10000));
		System.out.println(customerYu.calcPrice(10000));
		
		System.out.println(customerMoong.showCustomerInfo());
		System.out.println(customerKain.showCustomerInfo());
		System.out.println(customerYu.showCustomerInfo());
		
		

	}

}
