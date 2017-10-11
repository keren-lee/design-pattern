package com.tyung.builder;

public abstract class ClodDrink implements Item {

	public abstract String name();

	public Packing packing() {
		
		return new Bottle();
	}

	public abstract Float price();

}
