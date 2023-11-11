package com.pizzastore;

import com.pizzastore.factories.PizzaFactory;
import com.pizzastore.models.Pizza;

public class PizzaStore {

	private PizzaFactory pizzaFactory;

	public PizzaStore(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;

	}

	public Pizza orderPizza(String type) {
		return pizzaFactory.create(type);
	}

}
