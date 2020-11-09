package be.intecbrussel.hoofdstuk10.oefeningen_extra.inheritenceDemo;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("a dog bites");
    }
}
