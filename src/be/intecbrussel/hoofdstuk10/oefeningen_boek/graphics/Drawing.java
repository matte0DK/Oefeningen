package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

import java.util.*;

public class Drawing implements Drawable, Iterable<Drawable> {
    private List<Drawable> shapesList;

    public Drawing() {
        shapesList = new ArrayList<>();
    }

    public void add(Drawable d) {
        shapesList.add(d);
    }

    public void remove(Drawable d) {
        shapesList.remove(d);
    }

    public void clear() {
        shapesList.clear();
    }

    public int getSize() {
        return shapesList.size();
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("this is my drawing: \n");
        for (Drawable drawable :
                shapesList) {
            toString.append(drawable.toString()).append("\n");
        }
        toString.append("Size is: ").append(shapesList.size());
        return toString.toString();
    }

    @Override
    public void draw(DrawingContext dc) {
        for (Drawable drawing : shapesList) {
            if (drawing != null) {
                drawing.draw(dc);
            }
        }
    }

    @Override
    public void scale(int s) {
        for (Drawable drawing : shapesList) {
            if (drawing != null) {
                drawing.scale(s);
            }
        }
    }

    @Override
    public Iterator iterator() {
        return shapesList.listIterator();
    }
}
