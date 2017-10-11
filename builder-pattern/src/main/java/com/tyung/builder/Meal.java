package com.tyung.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public Float getCost() {
		Float sum = 0f;
		for(Item item:items) {
			sum += item.price();
		}
		return sum;
	}
	
	public void showItems() {
		for(Item item:items) {
			System.out.println("item:"+item.name());
			System.out.println("packing:"+item.packing().pack());
			System.out.println("price:"+item.price());
		}
	}
}
