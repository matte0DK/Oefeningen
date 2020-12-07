package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

import java.util.Iterator;

public class IteratorApp {

    public static void main(String[] args) {
        Drawing myDrawing = new Drawing();

        IsoScelesTriangle iso = new IsoScelesTriangle();
        Rectangle rect = new Rectangle();
        Square square = new Square();

        myDrawing.add(iso);
        myDrawing.add(rect);
        myDrawing.add(square);

        Iterator myIt = myDrawing.iterator();

//        while(myIt.hasNext()) {
//            Object o = myIt.next();
//            System.out.println(o);
//        }

//        <=>

        for (Object o : myDrawing) {
            System.out.println(o);
        }
    }
}
