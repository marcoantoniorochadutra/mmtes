package com.pizzastore;

import com.pizzastore.factories.PizzaFactory;
import com.pizzastore.models.Pizza;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		PizzaStore store = new PizzaStore(new PizzaFactory());
		Pizza p = store.orderPizza("QUEIJO");
		p.prepare();
		p.bake();
		p.cut();
		p.box();
	}

}
