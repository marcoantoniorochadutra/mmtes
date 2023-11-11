package com.factory.models.base;

public abstract class Circle extends Shape {

	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Circle(String color, float radius) {
		super(color);
		this.radius = radius;
	}

}
