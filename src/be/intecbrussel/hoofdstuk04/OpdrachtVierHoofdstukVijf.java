package be.intecbrussel.hoofdstuk04;

import java.util.Scanner;

public class OpdrachtVierHoofdstukVijf {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        int myNumber = user.nextInt();
        int myNumber2 = user.nextInt();
        char myChar = (char) user.nextInt();

        System.out.println(myNumber + myNumber2);
        System.out.println(myNumber - myNumber2);
        System.out.println(myNumber / myNumber2);
        System.out.println(myNumber * myNumber2);
        System.out.println(myNumber % myNumber2);
        System.out.println(--myNumber);
        System.out.println(myNumber--);
        System.out.println(++myNumber);
        System.out.println(myNumber++);
        System.out.println(myChar++);


    }

}
