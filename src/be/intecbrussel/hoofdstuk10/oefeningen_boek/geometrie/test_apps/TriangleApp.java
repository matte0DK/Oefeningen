package be.intecbrussel.hoofdstuk10.oefeningen_boek.geometrie.test_apps;

import be.intecbrussel.hoofdstuk10.oefeningen_boek.geometrie.Shape;
import be.intecbrussel.hoofdstuk10.oefeningen_boek.geometrie.Triangle;

public class TriangleApp {
    public static void main(String[] args) {
        Shape myTriangle = new Triangle(10,20, -5);
        System.out.println(myTriangle.getPerimeter());
    }
}
