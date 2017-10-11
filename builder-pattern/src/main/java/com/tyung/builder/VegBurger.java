package com.tyung.builder;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "vegburger";
	}

	@Override
	public Float price() {
		return 3f;
	}

}
