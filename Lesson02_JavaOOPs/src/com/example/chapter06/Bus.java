package com.example.chapter06;

public class Bus {
	int busNum;
	int passengerCount;
	int busMoney;
	
	public Bus(int busNum) {
		this.busNum = busNum;
		
	}
	
	
	public void take(int busMoney) {
		this.busMoney += busMoney;
		passengerCount++;
	}
	
	public void takeOff(int passengerCount) {
		this.passengerCount--;
	}
	
	public void showInfo() {
		System.out.println(busNum + "�� ������ �°��� " + passengerCount + "�̰�, ���� ������ " + busMoney + "���Դϴ�.");
	}
	
	
	
}
