package org.malarcondev;

public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("this is rectangle");
    }
}
