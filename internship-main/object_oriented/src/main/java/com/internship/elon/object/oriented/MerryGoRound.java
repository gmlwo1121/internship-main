package com.internship.elon.object.oriented;

/**
 * 회전 목마
 */
public class MerryGoRound extends Rides{


	private int stars; // 별점

	public MerryGoRound(String name, int price, String limit, int stars) {
		super(name, price, limit);
		this.stars = stars;
	}

	public int getStars() {
		return stars;
	}

	@Override
	void run() {
		System.out.println("회전목마 출발 합니다.");
	}
}
