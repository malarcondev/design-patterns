package org.malarcondev;

public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null){
            return new ShapeDefault();
        }
        else if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return new ShapeDefault();
    }
}
