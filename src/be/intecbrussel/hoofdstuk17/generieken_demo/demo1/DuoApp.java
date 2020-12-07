package be.intecbrussel.hoofdstuk17.generieken_demo.demo1;

import be.intecbrussel.hoofdstuk17.generieken_demo.demo2.Dog;

import java.util.Scanner;

public class DuoApp {
    public static void main(String[] args) {
        Duo<Apple> appleDuo = new Duo<Apple>(new Apple(), new Apple());
        Duo<Fruit> pearDuo = new Duo<Fruit>(new Pear(), new Pear());
        Duo<Dog> dogDuo = new Duo<Dog>(new Dog("Sofia"), new Dog("Ronaldo"));

        Fruit pear = pearDuo.getFirst();
        pear.eat();

        System.out.println("fruit is healthy");
        System.out.println("water too");
        System.out.println("\n\n\n");

        System.out.println(dogDuo.getFirst().getName());
        dogDuo.swap();
        System.out.println(dogDuo.getFirst().getName());

        System.out.println("pear or pc, pick wisely");
        String input = new Scanner(System.in).nextLine();

        Duo<?> foodDuo = null;
        if (input.equalsIgnoreCase("apple")) {
            foodDuo = new Duo<>(new Apple(), new Apple());
        } else if (input.equalsIgnoreCase("pear")) {
            foodDuo = new Duo<>(new Pear(), new Pear());
        }
//        <=> Duo<?> pearDuo2 = new Duo<Pear>(new Pear(), new Pear());

        System.out.println("eating: " + foodDuo.getFirst() + " " + foodDuo.getSecond());
        System.out.println("-".repeat(20));

        Duo<?>[] intDuoArr = new Duo<?>[5];
    }
}
