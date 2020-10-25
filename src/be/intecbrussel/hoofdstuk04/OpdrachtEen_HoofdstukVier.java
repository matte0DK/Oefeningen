package be.intecbrussel.hoofdstuk04;

import java.util.Scanner;

public class OpdrachtEen_HoofdstukVier {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Give a number");
        int a = user.nextInt();

        System.out.println("Give me a second number");
        int b = user.nextInt();

        int sum;
        sum = a * b;

        System.out.println("The sum is  " + sum);

    user.close();

    }
}
