package org.malarcondev;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + shape1.getType());

        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + shape2.getType());
    }
}