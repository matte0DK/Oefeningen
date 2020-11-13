package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.test_apps;

import be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.*;

import java.util.Random;

public class DrawingApp {

    public static void main(String[] args) {
        Drawing myDrawing = new Drawing();

        for (int i = 0; i < 200; i++) {
            myDrawing.add(getRandomShape());
        }

        System.out.println(myDrawing);
    }

    private static Shape getRandomShape() {
        Random rng = new Random();
        int shapeType = rng.nextInt(5);

        switch (shapeType) {
            case 0:
                return new Circle(rng.nextInt(1000));
            case 1:
                return new IsoScelesTriangle(rng.nextInt(1000), rng.nextInt(1000), rng.nextInt(1000), rng.nextInt(1000));
            case 2:
                return new Rectangle(rng.nextInt(1000),rng.nextInt(1000),rng.nextInt(1000),rng.nextInt(1000));
            case 3:
                return new Square(rng.nextInt(1000), rng.nextInt(1000), rng.nextInt(1000));
            case 4:
                return new Triangle(rng.nextInt(1000),rng.nextInt(1000),rng.nextInt(1000));

        }
        return null;
    }
}
