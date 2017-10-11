package com.tyung.builder;

public abstract class Burger implements Item {

	public abstract String name();

	public Packing packing() {
		return new Wrapper();
	}

	public abstract Float price();

}
