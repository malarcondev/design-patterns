package org.malarcondev;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory1.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory1.getShape("rectangle");
        shape2.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory2.getShape("circular");
        shape3.draw();
    }
}