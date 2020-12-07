package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

import java.util.Random;

public class ShapeApp {
    public static void main(String[] args) throws NegativeSizeException {

        Rectangle rectangle = new Rectangle(13,51,48,66);
        Square square = new Square(13,48,66);
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        IsoScelesTriangle isoScelesTriangle = new IsoScelesTriangle();

        // perimeter test
        Shape myTriangle = new Triangle(10, 5, -2); // gelijkvormig met myThirdTriangle
        Shape mySecondTriangle = new Triangle(10, 5, 5);
        Shape myThirdTriangle = new Triangle(10, 5, 12);

        System.out.println(myTriangle.getPerimeter());
        System.out.println(mySecondTriangle.getPerimeter());
        System.out.println(myThirdTriangle.getPerimeter());

        System.out.println(myTriangle instanceof Object);
        System.out.println(mySecondTriangle instanceof Shape);
        System.out.println(myThirdTriangle instanceof Rectangle);
        System.out.println(myTriangle instanceof Square);
        System.out.println(mySecondTriangle instanceof Circle);
        System.out.println();

        Shape[] shapes = new Shape[10];


        Shape s = new Square();
        if (s instanceof Rectangle) {
            Rectangle r = (Rectangle) s;
            System.out.println("Rectangle with height: " + r.getHeight());
        } else if (s instanceof Circle) {
            Circle c = (Circle) s;
            System.out.println("Circle with radius: " + c.getRadius());
        }
    }
}
