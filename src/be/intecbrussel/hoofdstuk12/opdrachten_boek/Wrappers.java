package be.intecbrussel.hoofdstuk12.opdrachten_boek;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();

        Integer a = Integer.parseInt(input);
        a++;
        System.out.println(a + "\n");

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}
