package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.test_apps;

import be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.NegativeSizeException;
import be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.Rectangle;
import be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.Square;

public class SquareApp {
    public static void main(String[] args) throws NegativeSizeException {

        Rectangle myNewSquare = new Rectangle();
        Rectangle myFourthSquare = new Rectangle(8, 4);
        Square mySecondSquare = new Square(5, 3, 6);
        Square myThirdSquare = new Square(mySecondSquare);

//        myNewSquare.setSide(-20);
        myNewSquare.setPositions(3,4);
        myNewSquare.setHeight(77);
        myFourthSquare.setWidth(88);

//        printSquare(myNewSquare);
//        System.out.println();
//        printSquare(mySecondSquare);
//        System.out.println();
//        printSquare(myThirdSquare);
//        System.out.println();
//        printSquare(myFourthSquare);

        System.out.println(Rectangle.getCount());
        System.out.println(Square.getCount());

    }
    public static void printSquare(Square myNewSquare) {
        System.out.println("Square Area: " + myNewSquare.getArea());
        System.out.println("Square perimeter: " + myNewSquare.getPerimeter());
        System.out.println("Square Height: " + myNewSquare.getHeight());
        System.out.println("Square Width: " + myNewSquare.getWidth());
        System.out.println("Square Side: " + myNewSquare.getSide());
    }
}

//        System.out.println("-------------------");
//        System.out.println(mySecondSquare.toString());
//        System.out.println("-------------------");
//        System.out.println(myThirdSquare.toString());
//        System.out.println("-------------------");
//        System.out.println(myFourthSquare.toString());