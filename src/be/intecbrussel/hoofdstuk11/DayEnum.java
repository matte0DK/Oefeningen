package be.intecbrussel.hoofdstuk11;

public class DayEnum {

    public enum Day {

        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekDay() {
            return !equals(SATURDAY) && !equals(SUNDAY);
        }

        @Override
        public String toString() {
            return name() + ", weekday = " + this.isWeekDay();
        }
    }

    public static void main(String[] args) {

        Day[] days = Day.values();

        for (Day day :
                days) {
            System.out.println(day.toString());
        }
    }
}
