package com.factory.models;

import com.factory.models.base.Circle;

public class RedCircle extends Circle {

	public RedCircle(float base) {
		super("RED", base);
	}

	@Override
	public void draw() {
		System.out.println("Red Circle | Base: " + getRadius());
	}

}
