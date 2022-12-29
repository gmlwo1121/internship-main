package com.internship.elon.object.oriented;

import java.util.ArrayList;
import java.util.List;

public class TMain {
	public static void main(String[] args) {

		SpoonChopsticks chopsticks = new SpoonChopsticks("chopsticks");

		SpoonChopsticks spoon = new SpoonChopsticks("spoon");
		List<SpoonChopsticks> spoons = getSpoons();

		chopsticks.eat();
		spoon.eat();
	}

	private static List<SpoonChopsticks> getSpoons() {
		List<SpoonChopsticks> spoons = new ArrayList<>();
		for (int i = 0 ; i < 100 ; i++){
			spoons.add(new SpoonChopsticks("spoon"));
		}
		return spoons;
	}
}
