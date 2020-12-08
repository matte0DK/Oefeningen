package be.intecbrussel.hoofdstuk18.demo2;

import java.util.ArrayList;
import java.util.List;

public class FinalVariableDemo {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(5);
        intList.add(7);

        final int[] sum = new int[]{0};
        intList.forEach(number -> sum[0] += number);
    }
}
