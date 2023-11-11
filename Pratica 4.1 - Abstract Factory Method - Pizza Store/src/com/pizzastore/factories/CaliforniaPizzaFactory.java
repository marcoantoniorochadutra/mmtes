package com.pizzastore.factories;

import com.pizzastore.models.CalifornianPizza;
import com.pizzastore.models.CheesePizza;
import com.pizzastore.models.PepperoniPizza;
import com.pizzastore.models.Pizza;
import com.pizzastore.models.VeggiePizza;

public class CaliforniaPizzaFactory extends AbstractFactory {

	public Pizza create(String type) {

		switch (type) {
		case "QUEIJO":
			return new CheesePizza();
		case "CALIFORNIANA":
			return new CalifornianPizza();
		case "VEGANA":
			return new VeggiePizza();
		case "PEPPERONI":
			return new PepperoniPizza();
		default:
			System.err.println("SABOR DE PIZZA INDISPONÍVEL");
		}
		return null;
	}

	@Override
	public void listPizza() {
		System.out.println("----> PIZZARIA CALIFORNIA <----");
		System.out.println("1. Queijo, 2. Californiana, 3. Vegana, 4. Pepperoni");
		
	}

}
