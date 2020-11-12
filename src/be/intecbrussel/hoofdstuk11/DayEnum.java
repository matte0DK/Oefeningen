package be.intecbrussel.hoofdstuk11;

import java.util.Random;

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

        ONE_CENT, TWO_CENT, FIVE_CENT, TEN_CENT, TWENTY_CENT, FIFTY_CENT, ONE_EURO, TWO_EURO;

        private static final Coin[] coins = Coin.values();

        public double getValue(Coin coins) {
            double value = 0;
            switch (coins) {
                case ONE_CENT:
                    value += 0.01;
                    break;
                case TWO_CENT:
                    value += 0.02;
                    break;
                case FIVE_CENT:
                    value += 0.05;
                    break;
                case TEN_CENT:
                    value += 0.10;
                    break;
                case TWENTY_CENT:
                    value += 0.20;
                    break;
                case FIFTY_CENT:
                    value += 0.50;
                    break;
                case ONE_EURO:
                    value += 1.00;
                    break;
                case TWO_EURO:
                    value += 2.00;
                    break;

            }
            return value;
        }


    }

    public static void main(String[] args) {

        Day[] days = Day.values();

        for (Day day :
                days) {
            System.out.println(day.toString());
        }

        Random generator = new Random();
        int size = generator.nextInt(20) + 1;
        Coin[] coins = new Coin[size];
        float totalAmount = 0f;

        for (int i = 0; i < coins.length - 1; i++) {
            System.out.println(coins[i] = Coin.coins[generator.nextInt(Coin.coins.length)]);
            totalAmount += coins[i].getValue(coins[i]);
        }

        System.out.println(totalAmount);
    }
}
