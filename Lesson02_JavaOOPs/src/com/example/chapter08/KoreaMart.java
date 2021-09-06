package com.example.chapter08;

public class KoreaMart {

	public static void main(String[] args) {
		// ÄÚ¸®¾Æ¸¶Æ® °³¾÷! ÄÉÀÎÀÎ´Ô°ú ¹¶ÅÊÀÌ´ÔÀÌ À¯¸µ°Ô¼ş...
		Customer customerMoong = new Customer();
		customerMoong.setCustomerID(1001);
		customerMoong.setCustomerName("¹¶ÅÊÀÌ");
		customerMoong.setBonusPoint(1000);
		System.out.println(customerMoong.showCustomerInfo());
		
		
		Customer customerKain = new VIPCustomer();
		customerKain.setCustomerID(2001);
		customerKain.setCustomerName("ÄÉÀÎÀÎ");
		customerKain.setBonusPoint(1000);
		System.out.println(customerKain.showCustomerInfo());
		
		Customer customerYu = new GoldCustomer(3001, "À¯¸µ°Ô¼ş");
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
