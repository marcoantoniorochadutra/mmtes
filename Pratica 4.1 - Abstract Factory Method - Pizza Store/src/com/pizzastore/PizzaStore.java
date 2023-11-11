package com.pizzastore;

import com.pizzastore.factories.AbstractFactory;
import com.pizzastore.models.Pizza;

public class PizzaStore {

	private AbstractFactory pizzaFactory;

	public PizzaStore(AbstractFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;

	}

	public Pizza orderPizza(String type) {
		return pizzaFactory.create(type);
	}
	
	public void listPizza() {
		pizzaFactory.listPizza();
	}

}
