package be.intecbrussel.hoofdstuk12.opdrachten_boek;

import java.time.DayOfWeek;
import java.util.Scanner;

public class WeekDaysMonths {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int usersPick = keyboard.nextInt(7);

        System.out.println(DayOfWeek.of(usersPick));
    }
}
