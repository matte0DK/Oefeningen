package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.test_apps;

import be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.Rectangle;
import be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.Square;

public class Polymorphism {
    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(5);
        System.out.println(rect.getHeight());
        System.out.println(rect.getArea());

    }
}
