package com.pizzastore;

import com.pizzastore.factories.PizzaFactory;
import com.pizzastore.models.Pizza;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		Pizza p = factory.create("QUEIJO");
		p.bake();
		
	}

}
