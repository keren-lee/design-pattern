package com.tyung.pattern;

public class ShapeFactory {
	
	public <T extends Shape> T getClass(Class<? extends Shape> clazz) {
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
