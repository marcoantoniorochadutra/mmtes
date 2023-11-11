package com.pizzastore.models;

public class ClamPizza implements Pizza {
	
	@Override
	public void prepare() {
		System.out.println("Preparando Pizza de Molusco");
	}

	@Override
	public void bake() {
		System.out.println("Cozinhando Pizza de Molusco");

	}

	@Override
	public void cut() {
		System.out.println("Cortando Pizza de Molusco");

	}

	@Override
	public void box() {
		System.out.println("Encaixotando Pizza de Molusco");

	}
}
