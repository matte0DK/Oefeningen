package be.intecbrussel.hoofdstuk08.rectangle;

public class SquareApp {
    public static void main(String[] args) {

        Square myNewSquare = new Square();
        Square mySecondSquare = new Square(5, 3, 6);
        Square myThirdSquare = new Square(myNewSquare);
        Square myFourthSquare = new Square(8);

        myNewSquare.setSide(-6);
        myNewSquare.setPositions(3,4);

        System.out.println("Square Area: " + myNewSquare.getArea());
        System.out.println("Square perimeter: " + myNewSquare.getPerimeter());
        System.out.println("Square Height: " + myNewSquare.getHeight());
        System.out.println("Square Width: " + myNewSquare.getWidth());
        System.out.println("Square Side: " + myNewSquare.getSide());
        System.out.println("Square xPos: " + myNewSquare.getxPos());
        System.out.println("Square yPos: " + myNewSquare.getyPos());

        System.out.println(mySecondSquare.toString());
        System.out.println("-------------------");
        System.out.println(myThirdSquare.toString());
        System.out.println("-------------------");
        System.out.println(myFourthSquare.toString());
        System.out.println("-------------------");

    }
}
