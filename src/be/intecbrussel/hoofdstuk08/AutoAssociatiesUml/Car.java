package be.intecbrussel.hoofdstuk08.AutoAssociatiesUml;

import java.awt.*;
import java.util.Arrays;

public class Car {
    private String brand;
    private int speed = 0;
    private Color color;
    private Engine engine;
    private Person driver;
    private Person[] seats;


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed + " km/h" +
                ", color.=" + color.getName() +
                ", engine=" + engine.getFuel() + " L" +
                ", driver=" + driver.getName() +
                ", seats=" + Arrays.toString(seats) +
                '}';
    }


    // CONSTRUCTORS

    public Car(Color color, int seats) {
        this.color = color;
        this.seats = new Person[seats];
    }

    public Car(String brand, Color color, Engine engine, int seats) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.seats = new Person[seats];

    }

    // SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public void setPassengers(Person name, int index) { this.seats[index] = name; };

    // GETTERS
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Person getDriver() {
        return driver;
    }

    // FUNCTIONALITEITEN

    public void acceleration(int amount) {
        if (-amount > this.speed) {
            amount = -this.speed;
        }

        // say speed = 50. if i decelerate by 70 (amount = -70) -> reset deceleration on 50 (amount = 50)

        if (this.driver != null && amount <= this.engine.getFuel()) {
            this.speed += amount; // So it makes the car stop (speed = speed - speed)

            if (amount > 0) {
                this.engine.burnFuel(amount);
            }
        }

    }

    public void repaint(Color color) {
        this.color = color;
        System.out.println("Cost price: " + (color.getRgb()[0] + color.getRgb()[1] + color.getRgb()[2]));
    }

    public void sortPassengers() {
        Arrays.sort(seats, new PersonAgeComparator());
    }

    public void printPassengers() {
        for (Person person:
                seats) {
            System.out.println("name: " + person.getName() + " age: " + person.getAge());
        }
    }
}
