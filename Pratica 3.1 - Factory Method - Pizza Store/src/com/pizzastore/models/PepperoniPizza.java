package com.pizzastore.models;

public class PepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparando Pizza de Pepperoni");
	}

	@Override
	public void bake() {
		System.out.println("Cozinhando Pizza de Pepperoni");

	}

	@Override
	public void cut() {
		System.out.println("Cortando Pizza de Pepperoni");

	}

	@Override
	public void box() {
		System.out.println("Encaixotando Pizza de Pepperoni");

	}

}
