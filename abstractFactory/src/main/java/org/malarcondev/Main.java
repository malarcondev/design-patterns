package org.malarcondev;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = FactoryProducer.getFactory("shape");
        Shape shape1 = factory1.getShape("circle");
        shape1.draw();

        AbstractFactory factory2 = FactoryProducer.getFactory("rounded");
        RoundedShape rounded1 = factory2.getRoundedShape("circular");
        rounded1.rounded();
    }
}