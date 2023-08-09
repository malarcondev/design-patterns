package org.malarcondev;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null){
            return new RoundedDefault();
        } else if (shapeType.equalsIgnoreCase("circular")) {
            return new RoundedCircle();
        }
        return new RoundedDefault();
    }
}
