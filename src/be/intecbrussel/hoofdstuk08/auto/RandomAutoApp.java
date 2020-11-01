package be.intecbrussel.hoofdstuk08.auto;

import java.util.Random;

public class RandomAutoApp {
    public static void main(String[] args) {
        // OPDRACHT 7
        Random rand = new Random();

        Auto firstRandomCar = new Auto(Math.abs(rand.nextInt(100)));
        Auto secondRandomCar = new Auto(Math.abs(rand.nextInt(500)));
        Auto thirdRandomCar = new Auto(rand.nextBoolean());

        Auto.printMethode(firstRandomCar);
        System.out.println("-----------------------");
        Auto.printMethode(secondRandomCar);
        System.out.println("-----------------------");
        Auto.printMethode(thirdRandomCar);
        System.out.println("-----------------------");

        // OPDRACHT 9

        Auto[] myRandomCarArr = new Auto[20];

        for (int i = 0; i < myRandomCarArr.length; i++) {
            myRandomCarArr[i] = new Auto();
            System.out.println(myRandomCarArr[i].getSpeed());
        }   System.out.println("-----------------------");

        for (int i = 0; i < myRandomCarArr.length; i++) {
            myRandomCarArr[i] = new Auto();
            myRandomCarArr[i].park();
            System.out.println("____RANDOM[" + i + "]____");
            Auto.randomPrintMethod(myRandomCarArr[i]);
        }
    }
}
