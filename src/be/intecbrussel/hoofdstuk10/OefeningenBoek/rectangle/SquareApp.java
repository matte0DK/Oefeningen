package be.intecbrussel.hoofdstuk10.OefeningenBoek.rectangle;

public class SquareApp {
    public static void main(String[] args) {

        Square myNewSquare = new Square();
        Square myFourthSquare = new Square(8);
        Square mySecondSquare = new Square(5, 3, 6);
        Square myThirdSquare = new Square(myNewSquare);

        myNewSquare.setSide(-20);
        myNewSquare.setPositions(3,4);
        myNewSquare.setHeight(77);
        myFourthSquare.setWidth(88);

        printSquare(myNewSquare);
        printSquare(mySecondSquare);
        printSquare(myThirdSquare);
        printSquare(myFourthSquare);

    }
    public static void printSquare(Square myNewSquare) {
        System.out.println("Square Area: " + myNewSquare.getArea());
        System.out.println("Square perimeter: " + myNewSquare.getPerimeter());
        System.out.println("Square Height: " + myNewSquare.getHeight());
        System.out.println("Square Width: " + myNewSquare.getWidth());
        System.out.println("Square Side: " + myNewSquare.getSide());
        System.out.println("Square xPos: " + myNewSquare.getxPos());
        System.out.println("Square yPos: " + myNewSquare.getyPos());
    }
}

//        System.out.println("-------------------");
//        System.out.println(mySecondSquare.toString());
//        System.out.println("-------------------");
//        System.out.println(myThirdSquare.toString());
//        System.out.println("-------------------");
//        System.out.println(myFourthSquare.toString());