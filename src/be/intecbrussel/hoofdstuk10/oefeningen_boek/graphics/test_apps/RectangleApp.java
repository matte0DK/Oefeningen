package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.test_apps;

import be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.NegativeSizeException;
import be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.Rectangle;

public class RectangleApp {


    public static void main(String[] args) throws NegativeSizeException {
        Rectangle myRectangle = new Rectangle();
        Rectangle mySecondRectangle = new Rectangle(20, 10);
        Rectangle newRectangle = new Rectangle(mySecondRectangle);

        //first rectangle =
        myRectangle.setWidth(-10);
        myRectangle.setHeight(-20);
        myRectangle.setX(2);
        myRectangle.setY(3);

        //print perimeter and area
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());
        System.out.println(myRectangle.getHeight());
        System.out.println(myRectangle.getWidth());

        System.out.println(mySecondRectangle.getWidth());
        System.out.println(mySecondRectangle.getHeight());

        System.out.println(newRectangle.getWidth());
        System.out.println(newRectangle.getHeight());



        System.out.println(Rectangle.ANGLES);
        System.out.println(Rectangle.getCount());
    }
}
