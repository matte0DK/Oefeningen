package be.intecbrussel.hoofdstuk08.demos;

import java.util.Scanner;

public class NullpointerDemo {
    private Scanner userInput = new Scanner(System.in);

    {
        /* initialisatieblok, lijkt op een constructor maar grote verschil is dat dit globaal geldt voor elke constructor */
        userInput = new Scanner(System.in);
    }

    public NullpointerDemo() {
        /*userInput = new Scanner(System.in);*/
    }

    public static void main(String[] args) {
        NullpointerDemo npd = new NullpointerDemo();
        System.out.println(npd.getIntFromUser());

    }

    public int getIntFromUser() {
        return userInput.nextInt();
    }
}
