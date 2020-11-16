package be.intecbrussel.hoofdstuk11.opdracht01;

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
