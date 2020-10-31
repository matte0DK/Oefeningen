package be.intecbrussel.hoofdstuk08.auto;

public class AutoApp {
    public static void main(String[] args) {

        // OPDRACHT 2

        Auto myFirstCar = new Auto("Purple");
        Auto mySecondCar = new Auto(70.00);
        Auto myThirdCar = new Auto(200);
        System.out.println("------------------------------");

        // OPDRACHT 3
        System.out.println("Opdracht 3\n");

        myFirstCar.rePaint("Red");
        mySecondCar.acceleration(30);
        myThirdCar.toggleLights();
        System.out.println(mySecondCar.getSpeed());
        System.out.println(myThirdCar.getLights());
        System.out.println("------------------------------");

        // OPDRACHT 4
        System.out.println("Opdracht 4\n");

        Auto myRedCar = new Auto("Red");
        Auto myBiggerEngineCar = new Auto(250);
        Auto my5kmCar = new Auto(5.0);
        System.out.println(myRedCar.getColor());
        System.out.println(myBiggerEngineCar.getHorsepower());
        System.out.println(my5kmCar.getSpeed());
        System.out.println("------------------------------");

        // OPDRACHT 5
        System.out.println("Opdracht 5\n");

        myRedCar.printMethode(myRedCar);
        System.out.println("------------------------------");
        myBiggerEngineCar.printMethode(myBiggerEngineCar);
        System.out.println("------------------------------");
        my5kmCar.printMethode(my5kmCar);
        System.out.println("------------------------------");

        // OPDRACHT 6
        System.out.println("Amount of cars made so far: " + Auto.getCount());

    }
}
