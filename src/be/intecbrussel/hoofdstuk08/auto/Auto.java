package be.intecbrussel.hoofdstuk08.auto;

import java.awt.*;
import java.util.Random;

public class Auto {
    private static int count = 0;

    private int speed;
    private int horsepower;
    private String color;
    private boolean lights;


//    {
//        this.lights = true;
//        this.horsepower = 100;
//        this.color = "White";
//    }

    {
        count++;
    }

    // CONSTRUCTORS
    public Auto(int speed, int horsepower, String color, boolean lights) {
        this.speed = speed;
        this.horsepower = horsepower;
        this.color = color;
        this.lights = lights;
        //constructor alle parameters
    }


    public Auto(double speed) {
        this((int) speed, 100, "white", false);
        // constructor speed
    }

    public Auto(int horsepower) {
        this(0, horsepower, "white", false);
        // constructor horsepower
    }

    public Auto(String color) {
        this(0, 100, color, false);
        // constructor color
    }

    public Auto(boolean lights) {
        this(0, 100, "white", lights);
    }

    // Random car constructor!
    public Auto() {
        this(   Auto.myRandSpeed(),
                Auto.myRandomHorsepower(),
                Auto.myRandomColor(),
                Auto.myRandomLight());

    }

    // SETTERS
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    // public void setColor(String color) {
    //    this.color = color;
    // }

    // GETTERS
    public int getSpeed() {
        return speed;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getColor() {
        return color;
    }

    public boolean getLights() {
        return lights;
    }


    // FUNCTIONALITEITEN
    public void acceleration(int acceleration) {
        if (acceleration >= 0) {
            this.speed += acceleration;
        }
    }

    public void deceleration(int deceleration) {
        if (speed - deceleration >= 0) {
            this.speed -= deceleration;
        }
    }

    public void park() {
        this.speed = 0;
        this.lights = false;
    }

    public void rePaint(String newColor) {
        this.color = newColor;
        int costPrice = 0;
        for (int i = 0; i < newColor.length(); i++) {
            costPrice = newColor.charAt(i);
        }
        System.out.println("new color: " + newColor + ", costs: " + costPrice + "$");
    }

    public void toggleLights() {
        if (lights) {
            this.lights = false;
        } else {
            this.lights = true;
        }
    }

    public static void printMethode(Auto myCars) {
        System.out.println("speed: " + myCars.getSpeed());
        System.out.println("hp: " + myCars.getHorsepower());
        System.out.println("color: " + myCars.getColor());
        System.out.println("lights: " + myCars.getLights());
    }
    public static void randomPrintMethod(Auto random) {
        System.out.println("speed: " + myRandSpeed());
        System.out.println("hp: " + myRandomHorsepower());
        System.out.println("color: " + myRandomColor());
        System.out.println("lights: " + myRandomLight());
    }

    public static int getCount() {
        return count;
    }


    // OPDRACHT 8 RANDOM.UTIL
    public static int myRandSpeed() {
        Random rand = new Random();
        int randSpeed = Math.abs(rand.nextInt(100));
        return randSpeed;
    }

    public static int myRandomHorsepower() {
        Random rand = new Random();
        int randHorse = Math.abs(rand.nextInt(Math.max(100, 500)));
        return randHorse;
    }

    public static String myRandomColor() {
        Random rand = new Random();
        float r = (float) (rand.nextFloat() / 2f + 0.5);
        float g = (float) (rand.nextFloat() / 2f + 0.5);
        float b = (float) (rand.nextFloat() / 2f + 0.5);

        Color randomColor = new Color(r, g, b);
        return randomColor.toString();
    }

    public static boolean myRandomLight() {
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
