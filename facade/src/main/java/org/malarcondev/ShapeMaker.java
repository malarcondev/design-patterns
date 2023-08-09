package org.malarcondev;

public class ShapeMaker {
    private Shape cicle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.cicle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        cicle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
