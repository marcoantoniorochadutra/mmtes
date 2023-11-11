package com.factory.factories;

import com.factory.models.BlueCircle;
import com.factory.models.BlueRectangle;
import com.factory.models.BlueSquare;
import com.factory.models.base.Shape;

public class BlueShapeFactory extends AbstractFactory {

	@Override
	public Shape getCircle(float radius) {
		return new BlueCircle(radius);
	}

	@Override
	public Shape getRectangle(float base) {
		return new BlueRectangle(base);
	}

	@Override
	public Shape getSquare(float height) {
		return new BlueSquare(height);
	}

}
