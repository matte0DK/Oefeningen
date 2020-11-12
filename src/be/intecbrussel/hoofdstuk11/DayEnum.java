package be.intecbrussel.hoofdstuk11;

public class DayEnum {

    public enum Day {


        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekDay() {
            return !equals(SATURDAY) && !equals(SUNDAY);
        }

        @Override
        public String toString() {
            return super.toString() + ", weekday = " + this.isWeekDay();
        }
    }

    public enum Coin {

        ONE_CENT(0.01),
        TWO_CENT(0.02),
        FIVE_CENT(0.05),
        TEN_CENT(0.10),
        TWENTY_CENT(0.20),
        FIFTY_CENT(0.50),
        ONE_EURO(1.00),
        TWO_EURO(2.00);

        private double value;

        private Coin(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return name() +
                    "(" + value +
                    ") ";
        }
    }

    public enum Planet {

        MERCURY(3.302 * (Math.pow(10,24)), 57.91 * (Math.pow(10,6))),
        VENUS(4.856 * (Math.pow(10,24)), 1.0821 * (Math.pow(10,8))),
        EARTH(5.972 * (Math.pow(10,24)), 149.6 * (Math.pow(10,6))),
        MARS(6.418 * (Math.pow(10,23)), 2.279 * (Math.pow(10,8))),
        JUPITER(1.899 * (Math.pow(10,27)), 7.7841 * (Math.pow(10,8))),
        SATURN(5.685 * (Math.pow(10,26)), 1.426 * (Math.pow(10,9))),
        URANUS(8.683 * (Math.pow(10,25)), 2.88 * (Math.pow(10,9))),
        NEPTUNE(1.0243 * (Math.pow(10,26)), 4.498 * (Math.pow(10,9))),
        PLUTO(1.302 * (Math.pow(10,22)), 5.9068 * (Math.pow(10,9)));

        private float mass;
        private float distance;

        private Planet(double mass, double distance) {
            this.mass = (float)mass;
            this.distance = (float)distance;
        }

        @Override
        public String toString() {
            return name() +
                    ", mass= " + mass + "(kg)" +
                    ", distance= " + distance + "(km)" +
                    "} ";
        }
    }

    public static void main(String[] args) {

        //day enum
        Day[] days = Day.values();

        for (Day day :
                days) {
            System.out.println(day.toString());
        }

        System.out.println("-----------------------------------");

        //coin enum
        Coin[] coins = Coin.values();
        float totalAmount = 0;

        for (int i = 0; i < coins.length; i++) {
            totalAmount += coins[i].getValue();
        }

        System.out.println(totalAmount - (float) Coin.TWENTY_CENT.getValue());

        System.out.println("-----------------------------------");

        //planet enum
        Planet[] solarSystem = Planet.values();

        for (Planet planet :
                solarSystem) {
            System.out.println(planet.toString());
        }
    }
}
