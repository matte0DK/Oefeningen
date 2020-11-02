package be.intecbrussel.hoofdstuk08.auto;

import java.util.Random;

public class RandomAutoApp {
    public static void main(String[] args) {
        // OPDRACHT 7

        Auto firstRandomCar = new Auto(Auto.myRandomSpeed());
        Auto secondRandomCar = new Auto(Auto.myRandomHorsepower());
        Auto thirdRandomCar = new Auto(Auto.myRandomLight());

        Auto.printMethode(firstRandomCar);
        System.out.println("-----------------------");
        Auto.printMethode(secondRandomCar);
        System.out.println("-----------------------");
        Auto.printMethode(thirdRandomCar);
        System.out.println("-----------------------");

        // OPDRACHT 9

        Auto[] myRandomCarArr = new Auto[20];

        for (int i = 0; i < myRandomCarArr.length; i++) {
            myRandomCarArr[i] = Auto.createRandomCar();
            System.out.println(myRandomCarArr[i].getSpeed());
        }
        System.out.println("-----------------------");

        for (int i = 0; i < myRandomCarArr.length; i++) {
            myRandomCarArr[i] = Auto.createRandomCar();
            myRandomCarArr[i].park();
            System.out.println("____RANDOM[" + i + "]____");
            Auto.printMethode(myRandomCarArr[i]);
        }
    }
}
