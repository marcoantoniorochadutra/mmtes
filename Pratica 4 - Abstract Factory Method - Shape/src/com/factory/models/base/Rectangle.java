package com.factory.models.base;

public abstract class Rectangle extends Shape {

	private float base;

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public Rectangle(String color, float base) {
		super(color);
		this.base = base;
	}

}
