package be.intecbrussel.hoofdstuk05;

public class Opdracht17_7 {

    public static void main(String[] args) {

        int myNumber;
        for (myNumber = 0; myNumber < 10000; myNumber++) {

            boolean devidableBySix = myNumber % 6 == 0;
            boolean devidableByTwentyFive = myNumber % 28 == 0;

            if (devidableBySix && devidableByTwentyFive) {
                System.out.println(myNumber);
            }
        }
    }

}
