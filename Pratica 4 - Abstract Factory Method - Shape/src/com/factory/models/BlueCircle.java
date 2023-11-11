package com.factory.models;

import com.factory.models.base.Circle;

public class BlueCircle extends Circle {

	public BlueCircle(float radius) {
		super("BLUE", radius);
	}

	@Override
	public void draw() {
		System.out.println("Blue Circle | Base: " + getRadius());
	}

}
