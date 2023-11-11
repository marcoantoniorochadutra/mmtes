package com.factory.models;

import com.factory.models.base.Rectangle;

public class BlueRectangle extends Rectangle {

	public BlueRectangle(float base) {
		super("BLUE", base);
	}

	@Override
	public void draw() {
		System.out.println("Blue Rectangle | Base: " + getBase());
	}

}
