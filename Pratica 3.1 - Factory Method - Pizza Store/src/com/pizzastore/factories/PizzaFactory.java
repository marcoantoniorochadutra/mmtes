package com.pizzastore.factories;

import com.pizzastore.models.CheesePizza;
import com.pizzastore.models.ClamPizza;
import com.pizzastore.models.PepperoniPizza;
import com.pizzastore.models.Pizza;
import com.pizzastore.models.VeggiePizza;

public class PizzaFactory {
	
	
	public Pizza create(String type) {
		
		switch (type) {
				case "QUEIJO": return new CheesePizza();
				case "MOLUSCO": return new ClamPizza();
				case "VEGANA": return new VeggiePizza();
				case "PEPPERONI": return new PepperoniPizza();
			default:
				System.err.println("SABOR DE PIZZA INDISPONÍVEL");
			}

			return null;
		}

}
