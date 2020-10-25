package be.intecbrussel.hoofdstuk06;

import java.util.Arrays;
import java.util.Random;

public class Opdracht01_RandomApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        int c = rand.nextInt(100);

        printRandoms(a,b,c);
    }
    public static void printRandoms(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
