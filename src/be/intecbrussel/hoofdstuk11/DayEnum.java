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

        public double getValue(Enum coins) {
            double value = 0;
            if (Coin.ONE_CENT.equals(coins)) {
                value += 0.01;
            } else if (Coin.TWO_CENT.equals(coins)) {
                value += 0.02;
            } else if (Coin.FIVE_CENT.equals(coins)) {
                value += 0.05;
            } else if (Coin.TEN_CENT.equals(coins)) {
                value += 0.10;
            } else if (Coin.TWENTY_CENT.equals(coins)) {
                value += 0.20;
            } else if (Coin.FIFTY_CENT.equals(coins)) {
                value += 0.50;
            } else if (Coin.ONE_EURO.equals(coins)) {
                value += 1.00;
            } else if (Coin.TWO_EURO.equals(coins)) {
                value += 2.00;
            }
            return value;
        }

    }

    public static void main(String[] args) {

        Day[] days = Day.values();

        Random generator = new Random();
        int size = generator.nextInt(20) + 1;
        Coin[] coins = new Coin[size];
        float totalAmount = 0f;

        //day enum
        for (Day day :
                days) {
            System.out.println(day.toString());
        }

        System.out.println("-----------------------------------");

        //coin enum
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Coin.coins[generator.nextInt(Coin.coins.length)];
            totalAmount += coins[i].getValue(coins[i]);
        }

        for (Coin coin :
                coins) {
            System.out.print(coin.name() + ", ");
        }

        System.out.println("= " + totalAmount);


    }
}
