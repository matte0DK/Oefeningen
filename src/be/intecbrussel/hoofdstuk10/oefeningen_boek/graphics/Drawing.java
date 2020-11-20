package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

import java.util.Arrays;
import java.util.Iterator;

public class Drawing implements Drawable, Iterable{
    private Drawable[] shapes;
    private int size;

    public Drawing() {
        shapes = new Drawable[100];
    }

    public void add(Drawable d) {
        int index = findFirstArrSpot();

        boolean isNotAlreadyInDrawing = !containsShape(d);
        boolean indexIsNotMinusOne = index == -1;


        if (isNotAlreadyInDrawing) {
            if (indexIsNotMinusOne) {
                shapes = Arrays.copyOf(shapes, shapes.length + 1);
                index = shapes.length - 1;
            }

            shapes[index] = d;
            size++;
        }

    }

//    public void add2(Shape s) {
//        if (!containsShape(s)) {
//            int index = findFirstArrSpot();
//
//            if (index != -1) {
//                shapes[index] = s;
//            }
//        }
//    }
// andere manier om de add methode te beschrijven, Manu heeft liever de eerste,
// omdat deze nog redelijk leeg is, dus als men iets moet aanvullen kan dit gemakkelijker aangevult worden.

    public void remove(Drawable d) {
        int index = indexOfShape((Shape) d);
        if (index != 1) {
            shapes[index] = null;
            size--;
        }
    }

    public void clear() {
        Arrays.fill(shapes, null);
    }

    public int getSize() {
        return size;
    }

    // check index of shape.
    private int indexOfShape(Drawable s) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null && shapes[i].equals(s)) {
                return i;
                // we gebruiken hier 'of' omdat als de eerste true is we een index terug willen krijgen
                // en niet nog eens checken of shape op index i gelijk is aan onze gegeven shape.
            }
        }
        return -1;
    }

    // check if spots in array are filled with shapes.
    private boolean containsShape(Drawable s) {
        return indexOfShape(s) != -1;
    }

    // gives us first empty space to fill in.
    private int findFirstArrSpot() {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                return i;
            }
        }
        return -1;

        // een beetje conventie om -1 te retourneren in deze situatie, met arrays,
        // als geen index terug te geven is = return -1.
    }

    @Override
    public String toString() {
        String toString = "";
        toString += "this is my drawing: \n";
        for (Drawable drawable :
                shapes) {
            toString += drawable.toString() + "\n";
        }
        toString += "Size is: " + size;
        return toString;
    }

    @Override
    public void draw(DrawingContext dc) {
        for (Drawable drawing : shapes) {
            if (drawing != null) {
                drawing.draw(dc);
            }
        }
    }

    @Override
    public void scale(int s) {
        for (Drawable drawing : shapes) {
            if (drawing != null) {
                drawing.scale(s);
            }
        }
    }

    @Override
    public Iterator iterator() {
        return new DrawableIterator();
    }

    public class DrawableIterator implements Iterator {
        private int index = -1;

        @Override
        public boolean hasNext() {
            for (int i = index + 1; i < shapes.length; i++) {
                if (shapes[i] != null) {
                    index = i;
                    return true;
                }
            }

            return false;
        }

        @Override
        public Object next() {
            return shapes[index];
        }
    }
}
