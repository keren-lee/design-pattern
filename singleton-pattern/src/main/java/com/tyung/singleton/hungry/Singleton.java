package com.tyung.singleton.hungry;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	private static Singleton getInstance() {
		
		return instance;
	}
	
}
