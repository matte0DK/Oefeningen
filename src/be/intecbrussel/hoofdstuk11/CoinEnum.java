package be.intecbrussel.hoofdstuk11;

public class CoinEnum {

    public enum Coin {

        ONE_CENT(0.01),
        TWO_CENT(0.02),
        FIVE_CENT(0.05),
        TEN_CENT(0.10),
        TWENTY_CENT(0.20),
        FIFTY_CENT(0.50),
        ONE_EURO(1.00),
        TWO_EURO(2.00);

        private final double value;

        private Coin(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return name() + "(" + value + ") ";
        }
    }

    public static void main(String[] args) {

        Coin[] coins = Coin.values();
        float totalAmount = 0.0f;

        for (Coin coin :
                coins) {
            System.out.println(coin.toString());
            totalAmount += coin.getValue();
        }
        System.out.println("total value of given coins: " + totalAmount);
    }
}
