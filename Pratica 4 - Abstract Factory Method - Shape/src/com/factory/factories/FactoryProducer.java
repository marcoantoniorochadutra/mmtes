package com.factory.factories;

public class FactoryProducer {

	public static AbstractFactory getFactory(String color) {

		if ("BLUE".equalsIgnoreCase(color)) {
			return new BlueShapeFactory();

		} else if ("RED".equalsIgnoreCase(color)) {

			return new RedShapeFactory();
		} else {
			throw new RuntimeException("UNAVAILABLE FACTORY | COLOR: " + color);
		}
	}

}
