package be.intecbrussel.hoofdstuk11.opdracht01;

import java.util.Random;

public class CoinApp {
    public static void main(String[] args) {

        Coin fiveCent = Coin.FIVE_CENT;
        Coin[] possibleCoins = Coin.values();

        Coin[] coins = new Coin[10];
        Random generator = new Random();

        for (int i = 0; i < coins.length; i++) {
            int j = generator.nextInt(8);
            coins[i] = Coin.values()[j];
        }
        float totalAmount = 0;

        for (Coin coin :
                coins) {
            System.out.println(coin.toString());
            totalAmount += coin.getCentValue();
        }

//        for (Coin coin : possibleCoins) {
//            System.out.println(coin);
//        }

        System.out.println("total value of given coins: " + totalAmount);
        System.out.println(fiveCent.isEuro());
    }
}
