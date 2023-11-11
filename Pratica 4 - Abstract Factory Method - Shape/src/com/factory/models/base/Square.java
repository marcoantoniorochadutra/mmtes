package com.factory.models.base;

public abstract class Square extends Shape {

	private float height;

	public Square(String color, float base) {
		super(color);
		this.height = base;
	}

	public float getBase() {
		return height;
	}

	public void setBase(float base) {
		this.height = base;
	}

}
