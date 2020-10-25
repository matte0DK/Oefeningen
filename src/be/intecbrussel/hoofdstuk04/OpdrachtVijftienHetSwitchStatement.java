package be.intecbrussel.hoofdstuk04;

public class OpdrachtVijftienHetSwitchStatement {

    public static void main(String[] args) throws Exception {

        System.out.println("Enter your letter (CAPITALS)");
        char letter = (char) System.in.read();

        int scrabbleValue = 0;

        switch (letter) {

            default  :
                System.out.println(scrabbleValue);
                System.out.println("Please enter a correct letter between A and Z.");
                break;

            case 'A' :
            case 'E' :
            case 'I' :
            case 'N' :
            case 'O' : scrabbleValue = 1; break;

            case 'D' :
            case 'R' :
            case 'S' :
            case 'T' : scrabbleValue = 2; break;

            case 'B' :
            case 'G' :
            case 'K' :
            case 'L' :
            case 'M' :
            case 'P' : scrabbleValue = 3; break;

            case 'F' :
            case 'H' :
            case 'J' :
            case 'U' :
            case 'V' :
            case 'Z' : scrabbleValue  = 4; break;

            case 'C' :
            case 'W' : scrabbleValue = 5; break;

            case 'X' :
            case 'Y' : scrabbleValue = 8; break;

            case 'Q' : scrabbleValue = 10; break;
        }

        System.out.println("You have this many points:  " + scrabbleValue);


    }

}
