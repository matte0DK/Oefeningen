package be.intecbrussel.hoofdstuk05;

import java.util.Scanner;

public class Opdracht14_1 {

    public static void main(String[] args) {

        System.out.println("what is you're age?");

        Scanner user = new Scanner(System.in);
        int age = user.nextInt();

        if (age >= 18) {
            System.out.println("you are an adult");
        } else if (age >= 12) {
            System.out.println("you are a teenager");
        } else if (age >= 3) {
            System.out.println("you are a bambino");
        } else {
            System.out.println("you are a foetus");
        }

    }

}
