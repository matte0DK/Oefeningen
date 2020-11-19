package be.intecbrussel.hoofdstuk12.opdrachten_boek;

import java.time.LocalDate;

public class LocalDateApp {
    public static void main(String[] args) {

        LocalDate myBirthDay = LocalDate.of(1965, 1, 2);

        System.out.println(myBirthDay.getDayOfYear());
        System.out.println(myBirthDay.getDayOfMonth());
        System.out.println(myBirthDay.getDayOfWeek());
        System.out.println(myBirthDay.isLeapYear());
    }
}
