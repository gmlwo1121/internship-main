package com.internship.elon.object.oriented;


/**
 * The type Roller coaster.
 */

public class RollerCoaster extends Rides {
	private int scared; // 무서움지수

	public RollerCoaster(String name, int price, String limit , int scared) {
		super(name, price, limit);
		this.scared = scared;
	}

	@Override
	void run() {
		System.out.println("롤러코스터 출발 합니다.");
	}
}
