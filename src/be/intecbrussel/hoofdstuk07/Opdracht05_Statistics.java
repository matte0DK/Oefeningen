package be.intecbrussel.hoofdstuk07;

import java.util.Arrays;

public class Opdracht05_Statistics {

    public static void main(String[] args) {

        int[] anotherArray = {7,5,6,4,2};

        System.out.println(average(anotherArray));
        System.out.println(min(anotherArray));
        System.out.println(max(anotherArray));
    }

    public static int average(int... values) {
        int total = 0;
        for (int el :
                values) {
            total += el;
        }
        int avg = 0;
        if (values.length != 0) {
            avg = total/ values.length;
        } return avg;
    }

    public static int min(int... values) {

        int min = values[0];

//        for (int i = 0; i < values.length; i++) {
//            if (min > values[i]) {
//                min -= values[i];
//            }
//        }

        Arrays.sort(values);
        return values[0];
    }

    public static int max(int... values) {
        int max = values[0];

//        for (int i = 0; i < values.length;i++) {
//            if (max < values[i]) {
//                max += values[i];
//            }
//        }

        Arrays.sort(values);
        return values[values.length-1];
    }
}
