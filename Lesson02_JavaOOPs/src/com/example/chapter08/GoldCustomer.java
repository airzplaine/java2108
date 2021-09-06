package com.example.chapter08;

public class GoldCustomer extends Customer {
	// Customer �Ӽ��� ����ϵ� �߰����� �Ӽ� �߰� ����
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
