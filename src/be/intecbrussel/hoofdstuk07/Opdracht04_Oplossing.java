package be.intecbrussel.hoofdstuk07;

import java.util.Scanner;

public class Opdracht04_Oplossing {
    public static void main(String[] args) {

        //arrays van alfabet en waarde
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
        int[] values = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        String text;
        char[] textIntoChars;
        int totalPoints = 0;

        Scanner userWord = new Scanner(System.in);
        System.out.println("what is your scrabble word?");
        text = userWord.nextLine();

        textIntoChars = text.toLowerCase().toCharArray();

        for (char letter :
                textIntoChars) {
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == letter) {
                    totalPoints += values[i];
                    break;
                }
            }
        }
        System.out.println(totalPoints);
    }
}
