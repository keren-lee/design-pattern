package com.tyung.pattern;

public class ShapeFactoryDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape class3 = shapeFactory.getClass(Rectangle.class);
		class3.draw();
		Shape class2 = shapeFactory.getClass(Square.class);
		class2.draw();
		Shape class1 = shapeFactory.getClass(Circle.class);
		class1.draw();
	}
}
