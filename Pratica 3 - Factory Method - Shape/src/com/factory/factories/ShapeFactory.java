package com.factory.factories;

import com.factory.models.Circle;
import com.factory.models.Rectangle;
import com.factory.models.Shape;
import com.factory.models.Square;

public class ShapeFactory {
	
	public Shape getShape(String shape) {

		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}

		return null;
	}

}
