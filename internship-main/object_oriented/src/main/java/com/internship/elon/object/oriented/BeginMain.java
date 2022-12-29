package com.internship.elon.object.oriented;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BeginMain {

	public static void main(String[] args) {
		Map rollerCoaster = new HashMap();
		rollerCoaster.put("name", "티익스프레스");
		rollerCoaster.put("price", "5000원");
		rollerCoaster.put("limit", "160CM");

		System.out.println(rollerCoaster.toString());

		Map rollerCoaster2 = new HashMap();
		rollerCoaster2.put("name", "티익스프레스2");
		rollerCoaster2.put("price", "7000원");
		rollerCoaster2.put("limit", "140CM");

		System.out.println(rollerCoaster2.toString());


	}
}
