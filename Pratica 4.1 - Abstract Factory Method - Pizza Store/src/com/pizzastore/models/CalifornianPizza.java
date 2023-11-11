package com.pizzastore.models;

public class CalifornianPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparando Pizza Californiana");
	}

	@Override
	public void bake() {
		System.out.println("Cozinhando Pizza Californiana");

	}

	@Override
	public void cut() {
		System.out.println("Cortando Pizza Californiana");

	}

	@Override
	public void box() {
		System.out.println("Encaixotando Pizza Californiana");

	}

}
