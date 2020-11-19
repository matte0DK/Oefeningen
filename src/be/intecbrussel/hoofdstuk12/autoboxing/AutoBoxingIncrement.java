package be.intecbrussel.hoofdstuk12.autoboxing;

public class AutoBoxingIncrement {
    public static void main(String[] args) {
        Integer i = 5;
        i++;
        System.out.println(i);
        // i wordt uitgepakt, 5 wordt verhoogt met 1, daarna in een nieuw object geplaatst.
    }
}
