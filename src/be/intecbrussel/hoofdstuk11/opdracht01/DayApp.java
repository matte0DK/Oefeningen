package be.intecbrussel.hoofdstuk11.opdracht01;

public class DayApp {

    public static void main(String[] args) {

        Day[] days = Day.values();

        for (Day day :
                days) {
            System.out.println(day.toString());
        }
    }
}
