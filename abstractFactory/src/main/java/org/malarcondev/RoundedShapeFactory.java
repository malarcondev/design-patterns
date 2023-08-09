package org.malarcondev;

public class RoundedShapeFactory implements AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public RoundedShape getRoundedShape(String rounded) {
        if (rounded == null){
            return new RoundedDefault();
        } else if (rounded.equalsIgnoreCase("circular")){
            return new RoundedCircle();
        }
        return null;
    }
}
