package org.malarcondev;

public class Square extends Shape{

    public Square(){
        type = "square";
    }
    @Override
    void draw() {
        System.out.println("this is square");
    }
}
