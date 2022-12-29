package com.internship.elon.object.oriented.dip;

public class SportCar extends HCar{
	@Override
	void drive() {
		System.out.println("스포츹카 달려요");
	}

	@Override
	void stop() {
		System.out.println("스포츹카 멈춰요");
	}
}
