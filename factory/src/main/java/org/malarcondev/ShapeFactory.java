package org.malarcondev;

public class ShapeFactory {
    public Shape getShape(String shape){
        if (shape == null){
            return new ShapeDefault();
        }
        if (shape.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        return new ShapeDefault();
    }
}
