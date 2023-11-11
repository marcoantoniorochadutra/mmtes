package com.pizzastore.models;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparando Pizza de Queijo");
	}

	@Override
	public void bake() {
		System.out.println("Cozinhando Pizza de Queijo");

	}

	@Override
	public void cut() {
		System.out.println("Cortando Pizza de Queijo");

	}

	@Override
	public void box() {
		System.out.println("Encaixotando Pizza de Queijo");

	}

}
