package com.factory.factories;

import com.factory.models.base.Shape;

public abstract class AbstractFactory {

	public abstract Shape getCircle(float radius);

	public abstract Shape getRectangle(float base);

	public abstract Shape getSquare(float height);

}
