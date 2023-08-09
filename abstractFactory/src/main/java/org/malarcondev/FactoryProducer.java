package org.malarcondev;

public class FactoryProducer {
    public static AbstractFactory getFactory(String typeFactory){
        if (typeFactory.equalsIgnoreCase("shape")) {
            return new ShapeFactory();

        } else if (typeFactory.equalsIgnoreCase("rounded")) {
            return new RoundedShapeFactory();
        }

        return null;
    }
}
