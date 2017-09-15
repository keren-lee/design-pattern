package com.tyung.pattern;

public class FactoryProducer {
	
	public static <T extends AbstractFactory> T getFactory(Class<? extends AbstractFactory> clazz) {
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
