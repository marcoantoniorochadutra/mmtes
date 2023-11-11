package com.factory.models;

import com.factory.models.base.Rectangle;

public class RedRectangle extends Rectangle {

	public RedRectangle(float base) {
		super("RED", base);
	}

	@Override
	public void draw() {
		System.out.println("Red Rectangle | Base: " + getBase());
	}

}
