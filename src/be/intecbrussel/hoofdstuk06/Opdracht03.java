package be.intecbrussel.hoofdstuk06;

import java.util.Scanner;

public class Opdracht03 {

    public static void main(String[] args) {

//        Scanner userInput = new Scanner(System.in);
//        String words = userInput.nextLine();

        String myString = "hello there";
        String myStringV2 = "HolLo thEre";

        printString(myString);
        printString(toUpperCase(myString));
        printString(toLowerCase(myString));
        printString(swapAWithO(myString));
        System.out.println("amount of 'e' in these words: " + countE(myString));
        System.out.println(areTheSame(myString,myStringV2));
    }

    public static void printString(String words) {
        System.out.println(words + " length of the string: " + words.length());
    }

    public static String toUpperCase(String words) {
        return words.toUpperCase();
    }

    public static String toLowerCase(String words) {
        return words.toLowerCase();
    }

    public static String swapAWithO(String words) {
        return words.replace('a','o');
    }

    public static int countE(String words) {
        int counter = 0;
        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            if (c == 'e') {
                counter++;
            }
        } return counter;
    }

    public static boolean areTheSame(String words, String otherWords) {
        boolean theSame = false;
        if (words.equalsIgnoreCase(otherWords)) {
            theSame = true;
        } return theSame;
    }
}
