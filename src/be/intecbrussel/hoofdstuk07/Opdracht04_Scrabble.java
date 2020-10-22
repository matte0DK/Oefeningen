package be.intecbrussel.hoofdstuk07;

import java.util.Scanner;

public class Opdracht04_Scrabble {
    public static void main(String[] args) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
        int[] values = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

        Scanner userWord = new Scanner(System.in);

        System.out.println("what is your scrabble word?");
        String scrabbleWords = userWord.nextLine();
        char[] letters = scrabbleWords.toCharArray();


        int score = 0;

        for (int r = 0; r < scrabbleWords.length(); r++) {
            for (int c = 0; c < 26; c++) {
                if (scrabbleWords.charAt(r) == alphabet[c]) {
                    score += values[c];
                }
            }
        }
        System.out.println("your score is: " + score);
    }


}
