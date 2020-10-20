package be.intecbrussel;

import java.lang.reflect.Array;

public class Opdracht1 {
    public static void main(String[] args) {
//        multiple of seven array
        int [] workingArray = multipleOfSeven();

//        boolean arrays
        boolean[] booleanArray = new boolean[2];
        booleanArray[0] = true;

//        print out multiple of seven array
        for (int temp:
             workingArray) {
            System.out.println(temp);
        }

//        print out boolean array
        for (boolean temp:
             booleanArray) {
            System.out.println(booleanArray);
        }
    }

    public static int[] multipleOfSeven(){

        int [] multipleOfSeven = new int[20];
        for (int i = 0; i < multipleOfSeven.length; i++) {
            multipleOfSeven[i] = 7 * (i-1);
        } return multipleOfSeven;
    }

    public static void printingReverse (int[] array) {
    }
}
//    int[] mutipleOfSeven = new int[20];
//    StringBuilder string7 = new StringBuilder();
//        string7.append(mutipleOfSeven[i]).append(" ");
