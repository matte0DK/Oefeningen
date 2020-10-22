package be.intecbrussel.hoofdstuk05;

import java.io.IOException;

public class Opdracht15_2 {

    public static void main(String[] args) throws IOException {

        System.out.println("enter your scrabbleletter");

        char scrabbleLetter = (char) System.in.read();
        int scrabbleWorth = 0;

        switch (scrabbleLetter) {
            default: scrabbleWorth = 0;
                System.out.println("please enter e correct number");
                break;

            case 'a':
            case 'e':
            case 'i':
            case 'n':
            case 'o': scrabbleWorth = 1; break;

            case 'd':
            case 'r':
            case 's':
            case 't': scrabbleWorth = 2; break;

            case 'b':
            case 'g':
            case 'k':
            case 'l':
            case 'p':
            case 'm': scrabbleWorth = 3; break;

            case 'f':
            case 'h':
            case 'j':
            case 'u':
            case 'v':
            case 'z': scrabbleWorth = 4; break;

            case 'c':
            case 'w': scrabbleWorth = 5; break;

            case 'x':
            case 'y': scrabbleWorth = 8; break;

            case 'q': scrabbleWorth = 10; break;
        }

        System.out.println("your letter is this much worth:  " + scrabbleWorth);

    }

}
