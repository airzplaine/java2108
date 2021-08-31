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
		System.out.println(busNum + "번 버스의 승객은 " + passengerCount + "이고, 현재 수입은 " + busMoney + "원입니다.");
	}
	
	
	
}
