package be.intecbrussel.hoofdstuk08.auto;

import java.util.Random;

public class RandomAutoApp {
    public static void main(String[] args) {
        // OPDRACHT 7
        Random rand = new Random();

        Auto firstRandomCar = new Auto(Math.abs((double) rand.nextInt(300)));
        Auto secondRandomCar = new Auto(Math.abs(rand.nextInt(500)));
        Auto thirdRandomCar = new Auto(rand.nextBoolean());

        firstRandomCar.printMethode(firstRandomCar);
        System.out.println("-----------------------");
        secondRandomCar.printMethode(secondRandomCar);
        System.out.println("-----------------------");
        thirdRandomCar.printMethode(thirdRandomCar);
        System.out.println("-----------------------");



        // OPDRACHT 9

        Auto[] myRandomCarArr = new Auto[20];

        for (int i = 0; i < myRandomCarArr.length; i++) {
            myRandomCarArr[i] = new Auto();
            System.out.println(myRandomCarArr[i].getSpeed());
        }

        for (int i = 0; i < myRandomCarArr.length; i++) {
            myRandomCarArr[i] = new Auto();
            myRandomCarArr[i].park();
            myRandomCarArr[i].printMethode(myRandomCarArr[i]);
        }
    }
}
