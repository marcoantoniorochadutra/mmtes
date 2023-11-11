package com.factory.models;

import com.factory.models.base.Square;

public class BlueSquare extends Square {

	public BlueSquare(float base) {
		super("BLUE", base);
	}

	@Override
	public void draw() {
		System.out.println("Blue Square | Base: " + getBase());
	}

}
