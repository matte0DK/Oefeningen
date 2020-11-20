package be.intecbrussel.hoofdstuk14;

import java.awt.*;

public class Paint {
    private Color color;

    public Paint(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "the paint is colored: " + color;
    }

    public enum Color {
        RED,BLUE,YELLOW,GREEN
    }

}
