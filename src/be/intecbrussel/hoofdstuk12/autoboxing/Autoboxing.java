package be.intecbrussel.hoofdstuk12.autoboxing;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Formatter;

public class Autoboxing {
    public static void main(String[] args) {
        Integer intObject = 5;
        int intPrimitive = Integer.valueOf(6);

        System.out.println(intObject);
        System.out.println(intPrimitive);

        // Formatting voorbeeld
        String text = "I'm %d years old and I'm %f tall! \n";
        Formatter formatter = new Formatter();

        formatter.format(text, 23, 1.73);
        formatter.format(text, Integer.valueOf(23), Double.valueOf(1.73)); // #BAD

        System.out.println(formatter);
    }
}

