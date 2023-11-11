package com.factory.models;

import com.factory.models.base.Square;

public class RedSquare extends Square {

	public RedSquare(float base) {
		super("RED", base);
	}

	@Override
	public void draw() {
		System.out.println("Red Square | Base: " + getBase());
	}

}
