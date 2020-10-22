package be.intecbrussel.hoofdstuk05;

import java.util.Scanner;

public class Opdracht16_5 {

    public static void main(String[] args) {

        System.out.println("please enter a number between 0 and 10");

        Scanner user = new Scanner(System.in);
        boolean wrongNumber = true;
        int userNumber = user.nextInt();

        do {
            if (userNumber <= 0 || userNumber >= 10) {
                wrongNumber = false;
            }
        } while (wrongNumber);

        System.out.println("please enter a correct number:");
    }

}
