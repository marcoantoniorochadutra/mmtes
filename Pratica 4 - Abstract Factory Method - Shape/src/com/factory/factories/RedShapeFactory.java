package com.factory.factories;

import com.factory.models.RedCircle;
import com.factory.models.RedRectangle;
import com.factory.models.RedSquare;
import com.factory.models.base.Shape;

public class RedShapeFactory extends AbstractFactory {

	@Override
	public Shape getCircle(float radius) {
		return new RedCircle(radius);
	}

	@Override
	public Shape getRectangle(float base) {
		return new RedRectangle(base);
	}

	@Override
	public Shape getSquare(float height) {
		return new RedSquare(height);
	}

}
