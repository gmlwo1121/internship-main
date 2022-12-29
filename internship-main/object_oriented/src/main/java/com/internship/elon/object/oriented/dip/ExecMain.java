package com.internship.elon.object.oriented.dip;

public class ExecMain {
	public static void main(String[] args) {
		HCarService hcs = new HCarService();
		hcs.drive(new Bus());
		hcs.drive(new SportCar());
	}
}
