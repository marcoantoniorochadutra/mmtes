package com.pizzastore;

import com.pizzastore.factories.CaliforniaPizzaFactory;
import com.pizzastore.factories.OficialPizzaFactory;

public class PizzaFactoryDemo {
	
	public static void main(String[] args) {
		
		PizzaStore oficial = new PizzaStore(new OficialPizzaFactory());
		oficial.listPizza();
		PizzaStore cali = new PizzaStore(new CaliforniaPizzaFactory());
		cali.listPizza();
		
	}

}
