package com.tyung.pattern;

public abstract class AbstractFactory {
	
	public abstract <T extends Color> T getColor(Class<? extends Color> clazz);
	
	public abstract <T extends Shape> T getShape(Class<? extends Shape> clazz);
	
}
