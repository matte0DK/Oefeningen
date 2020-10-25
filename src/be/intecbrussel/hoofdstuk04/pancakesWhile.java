package be.intecbrussel.hoofdstuk04;

import java.util.Scanner;

public class pancakesWhile {

    public static void main(String[] args) {

        System.out.println("How much pancakes did you eat already?");

        Scanner user = new Scanner(System.in);
        boolean hungry = true;
        int count = user.nextInt();

        System.out.println("take flour");
        System.out.println("add milk");
        System.out.println("add eggs");
        System.out.println("mix everything");

        do {
            System.out.println("Bake another ");
            System.out.println("    Eat another :" + ++count);

            if (count == 10) {
                hungry = false;
                System.out.println("Stop eating ya fatty");
                break;
            }

        } while (hungry);

    }

}
