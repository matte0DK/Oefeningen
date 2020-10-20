package be.intecbrussel;

import java.util.Scanner;

public class Opdracht2 {
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
