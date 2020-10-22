package be.intecbrussel.hoofdstuk08;

import java.awt.*;

public class Opdracht01_RectangleApp {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        Rectangle rectTwo = new Rectangle();
        rect.setPosition(4,7);
        rectTwo.setPosition(9,4);
        rect.setHeightAndWidth(18,10);

        System.out.println(rect.getArea(19, 4));

    }
}

//        rectTwo.width = 7;
//        rectTwo.height = 7;
//        rectTwo.x = 4;
//        rectTwo.y = 6;
//
//
//        System.out.print("width: " + rectTwo.width + " ");
//        System.out.println("height: " + rectTwo.height + " ");
//        System.out.print("x: " + rectTwo.x + " ");
//        System.out.println("y: " + rectTwo.y + " ");
//        /*second rectangle*/
//
//       VOORBEELD OM AAN TE TONEN HOE MEN OVERSCHRIJVEN VAN MEMBER_VAR DOOR LOKALE VAR KAN VOOKOMEN => this.

//   public class MyClass{
//        public int number = 5;
//
//        public void aMethod() {
//            int number = 6;
//            System.out.println(number);
//            System.out.println(this.number);
//        }
//    }