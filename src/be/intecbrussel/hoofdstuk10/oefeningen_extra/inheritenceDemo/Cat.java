package be.intecbrussel.hoofdstuk10.oefeningen_extra.inheritenceDemo;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("scratches eyes out");
    }
}
