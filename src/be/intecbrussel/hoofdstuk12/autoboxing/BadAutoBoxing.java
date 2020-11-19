package be.intecbrussel.hoofdstuk12.autoboxing;

public class BadAutoBoxing {
    public static void main(String[] args) {

        // VOORBEELD: deze onderstaande code is misschien correct, maar daarom niet snel.
        //            voor elk getal wordt op de achtergrond een nieuw object gemaakt.
        Integer a = 5;
        Integer b = 6;
        Integer c = a + b;
        System.out.println(c);
    }
}
