package org.malarcondev;

public interface AbstractFactory {
    Shape getShape(String shape);
    RoundedShape getRoundedShape(String rounded);
}
