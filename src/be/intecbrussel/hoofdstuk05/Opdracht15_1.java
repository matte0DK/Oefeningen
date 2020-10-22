package be.intecbrussel.hoofdstuk05;

import java.util.Scanner;

public class Opdracht15_1 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("number of the month?");
        int month = user.nextInt();
        int days = 0;

        switch (month) {
            default: days = 0;
                System.out.println("please enter a correct number");
                break;

            case 2 : days = 28 ; break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 31 ; break;

            case 4:
            case 6:
            case 9:
            case 11: days = 30; break;
        }

        System.out.println("number of days in the month:  " + days);

    }

}
