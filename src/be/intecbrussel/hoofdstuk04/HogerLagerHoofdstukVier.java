package be.intecbrussel.hoofdstuk04;

import java.util.Random;
import java.util.Scanner;

public class HogerLagerHoofdstukVier {
    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);
        var random = new Random();
        var numberToGuess = random.nextInt(100);
        System.out.println("Enter a number");

        var guessed = false;
        while (!guessed) {

            var guess = keyboard.nextInt();

            if (guess < 100) {
                System.out.println("HIGHER");
            }
            else if (guess >100) {
                System.out.println("LOWER");
            }
            else {
                System.out.println("YOU GOT IT");
                guessed = true;
            }

        }

        keyboard.close();

    }

}
