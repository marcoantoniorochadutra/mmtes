package com.pizzastore.factories;

import com.pizzastore.models.Pizza;

public abstract class AbstractFactory {

	public abstract Pizza create(String type);
	
	public abstract void listPizza();
}
