package com.tyung.singleton.lazzy_unsafe;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {}
	
	private static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
