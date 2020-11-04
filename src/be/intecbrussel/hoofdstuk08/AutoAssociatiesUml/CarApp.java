package be.intecbrussel.hoofdstuk08.AutoAssociatiesUml;

import java.util.Random;

public class CarApp {
    public static void main(String[] args) {
        Random rand = new Random();

        // Drivers
        Person myNewPerson = new Person("Jeans-Jeans", 54);
        Person mySecondPerson = new Person("Jeans-Jeacque", 45);
        Person marcel = new Person("Marcel", 57);
        Person samantha = new Person("Samantha" , 18);
        Person kimberly = new Person("Kimberly" , 21);
        Person chelsey = new Person("Chelsey" , 36);


        // colors
        Color yellow = new Color("yellow",255,255,0);
        Color magenta = new Color("purple" ,255,0,255);
        Color cyan = new Color("cyan", 0, 255, 255);
        Color red = new Color("red", 255, 0, 0);
        Color blue = new Color("blue" , 0, 0, 255);
        Color green = new Color("green", 0, 255, 0);
        Color white = new Color("white", 255,255,255);

        // cars
        Car yellowPeugeot = new Car("Peugot", yellow, new Engine(40), 4);
        Car redFerrari = new Car("Ferrari", red, new Engine(60), 2);
        Car suspiciousVan = new Car(white, 4);

        // set drivers and passengers
        yellowPeugeot.setDriver(myNewPerson);
        redFerrari.setDriver(mySecondPerson);

        suspiciousVan.setPassengers(marcel, 0);
        suspiciousVan.setPassengers(kimberly, 1);
        suspiciousVan.setPassengers(chelsey, 2);
        suspiciousVan.setPassengers(samantha, 3);


        // accelerate
        yellowPeugeot.acceleration(rand.nextInt());
        redFerrari.acceleration(rand.nextInt());

        //print using toString method
        System.out.println(yellowPeugeot.toString());
        System.out.println(redFerrari.toString());

        //repaint
        yellowPeugeot.repaint(red);

        //print passengers
        suspiciousVan.printPassengers();
        System.out.println("------------------------");


        //sort passengers
        suspiciousVan.sortPassengers();

        //print sorted passengers
        suspiciousVan.printPassengers();
        System.out.println("------------------------");


    }
}
