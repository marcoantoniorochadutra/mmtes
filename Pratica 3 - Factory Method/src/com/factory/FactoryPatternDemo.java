package com.factory;

import com.factory.factories.ShapeFactory;
import com.factory.models.Shape;

public class FactoryPatternDemo {
	
	
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.getShape("CIRCLE");
		circle.draw();
		Shape rect = factory.getShape("RECTANGLE");
		rect.draw();
		Shape square = factory.getShape("SQUARE");
		square.draw();

	}

}
