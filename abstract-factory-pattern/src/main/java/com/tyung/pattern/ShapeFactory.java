package com.tyung.pattern;

public class ShapeFactory extends AbstractFactory {

	public <T extends Color> T getColor(Class<? extends Color> clazz) {

		return null;
	}

	public <T extends Shape> T getShape(Class<? extends Shape> clazz) {
		T t = null;
		try {
			t = (T)Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return t;
	}
}
