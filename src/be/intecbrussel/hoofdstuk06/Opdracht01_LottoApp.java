package be.intecbrussel.hoofdstuk06;

import java.util.Arrays;
import java.util.Random;

public class Opdracht01_LottoApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(Math.abs(45));
        int b = rand.nextInt(Math.abs(45));
        int c = rand.nextInt(Math.abs(45));
        int d = rand.nextInt(Math.abs(45));
        int e = rand.nextInt(Math.abs(45));
        int f = rand.nextInt(Math.abs(45));

        printRandoms(a,b,c,d,e,f);
    }
    public static void printRandoms(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
