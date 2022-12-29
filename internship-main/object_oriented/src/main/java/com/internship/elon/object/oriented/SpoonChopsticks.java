package com.internship.elon.object.oriented;


/**
 * The type Spoon chopsticks.
 */


public class SpoonChopsticks {

	private String name;

	public SpoonChopsticks(String name) {
		this.name = name;
	}


	/**
	 * methodName : eat
	 * author : kim taehyun
	 * description :
	 */
	public void eat(){
		if(this.name.equals("spoon")){
			System.out.println("국물을 먹습니다.");
		}
		if(this.name.equals("chopsticks")){
			System.out.println("반찬을 먹습니다.");
		}

	}
	public void 숟가락만_할수있는일(){

	}
	public void 젓가락만_할수있는일(){

	}
}
