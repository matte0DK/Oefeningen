package be.intecbrussel.hoofdstuk05;

import java.util.Scanner;

public class Opdracht14_2 {

    public static void main(String[] args) {

        System.out.println("please enter your weight in kg:");
        Scanner user = new Scanner(System.in);
        System.out.println("please enter your length in cm:");

        int userWeight = user.nextInt();
        double userLength = user.nextDouble();
        double userBmi = userWeight / ((userLength / 100) * (userLength / 100));

        if (userBmi < 20) {
            System.out.println("underweight");
        } else if (userBmi < 25) {
            System.out.println("ok.");
        } else if (userBmi < 30) {
            System.out.println("overweight");
        } else if (userBmi < 40) {
            System.out.println("obese");
        } else  {
            System.out.println("sicking");
        }

    }

}
