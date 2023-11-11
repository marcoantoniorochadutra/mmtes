package com.factory;

import com.factory.factories.AbstractFactory;
import com.factory.factories.FactoryProducer;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory blueFactory = FactoryProducer.getFactory("BLUE");
		blueFactory.getCircle(0).draw();
		blueFactory.getRectangle(1).draw();
		blueFactory.getSquare(2).draw();

		
		AbstractFactory redFactory = FactoryProducer.getFactory("RED");
		redFactory.getCircle(3).draw();
		redFactory.getRectangle(4).draw();
		redFactory.getSquare(5).draw();

	}

}
