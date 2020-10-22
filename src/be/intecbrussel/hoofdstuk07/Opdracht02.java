package be.intecbrussel.hoofdstuk07;

import java.util.Scanner;

public class Opdracht02 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String text = userInput.nextLine();

        String[] givenText = text.split(" ");

        for (String temp:
             givenText) {
            System.out.println(temp);
        }
    }
}
