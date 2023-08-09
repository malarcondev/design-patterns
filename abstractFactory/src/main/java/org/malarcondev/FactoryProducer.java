package org.malarcondev;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean typeFactory){
        if (typeFactory) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
