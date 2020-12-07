package be.intecbrussel.hoofdstuk17.generieken_demo.demo2;

import be.intecbrussel.hoofdstuk17.generieken_demo.demo1.Duo;

public class DemoApp2 {
    public static void main(String[] args) {
        MixedDuo<Cat, Dog> mixedDuo = new MixedDuo<>(new Cat("Nero"), new Dog("Sofia"));
        Duo<Dog> dogDuo = new Duo<Dog>(new Dog("Sofia"), new Dog( "Ronaldo"));
    }
}
