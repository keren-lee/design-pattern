package com.tyung.singleton.inner;

public class Singleton {
	
	private Singleton() {}
	
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton(); 
	}
	
	private static Singleton getInstance() {
		
		return SingletonHolder.INSTANCE;
	}
	
}
