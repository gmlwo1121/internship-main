package com.internship.elon.object.oriented;

public abstract class Rides {
	private String name; // 이름
	private int price; // 가격
	private String limit; // 키제한


	public Rides(String name, int price, String limit) {
		this.name = name;
		this.price = price;
		this.limit = limit;
	}
	// 기구 시작에 대한 기능 메서드
	abstract void run();
}
