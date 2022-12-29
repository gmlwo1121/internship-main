package com.internship.elon.object.oriented;

import java.util.ArrayList;
import java.util.List;

public class OopMain {

	public static void main(String[] args) {

		RollerCoaster rc1 = new RollerCoaster("티익스프레스1", 5000, "150", 2);
		RollerCoaster rc2 = new RollerCoaster("티익스프레스1", 5000, "150", 2);
		RollerCoaster rc3 = new RollerCoaster("티익스프레스1", 5000, "150", 2);
		RollerCoaster rc4 = new RollerCoaster("티익스프레스1", 5000, "150", 2);
		RollerCoaster rc5 = new RollerCoaster("티익스프레스1", 5000, "150", 2);
		MerryGoRound mgr1 = new MerryGoRound("회전목마1", 3000, "120", 5);

		Rides ride2 = new MerryGoRound("회전목마1", 3000, "120", 5);
		Rides ride1 = new RollerCoaster("티익스프레스1", 5000, "150", 2);
		List<Rides> ridesList = new ArrayList<>();
		ridesList.add(ride2);
		ridesList.add(ride1);

		for (Rides rides : ridesList) {
			System.out.println("start");
			rides.run();
		}

	}
}
