package com.tyung.pattern;

public class AbstractFactoryDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactroy = FactoryProducer.getFactory(ShapeFactory.class);
		ColorFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
		Circle circle = shapeFactroy.getShape(Circle.class);
		circle.draw();
		Rectangle rectangle = shapeFactroy.getShape(Rectangle.class);
		rectangle.draw();
		Square square = shapeFactroy.getShape(Square.class);
		square.draw();
		Blue blue = colorFactory.getColor(Blue.class);
		blue.fill();
		Green green = colorFactory.getColor(Green.class);
		green.fill();
		Red red = colorFactory.getColor(Red.class);
		red.fill();
	}
}
