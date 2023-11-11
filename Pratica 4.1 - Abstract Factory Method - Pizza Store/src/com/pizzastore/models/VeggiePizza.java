package com.pizzastore.models;

public class VeggiePizza implements Pizza {
	
	@Override
	public void prepare() {
		System.out.println("Preparando Pizza de Vegetariana");
	}

	@Override
	public void bake() {
		System.out.println("Cozinhando Pizza de Vegetariana");

	}

	@Override
	public void cut() {
		System.out.println("Cortando Pizza de Vegetariana");

	}

	@Override
	public void box() {
		System.out.println("Encaixotando Pizza de Vegetariana");

	}
}
