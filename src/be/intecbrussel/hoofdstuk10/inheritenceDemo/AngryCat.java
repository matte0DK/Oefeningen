package be.intecbrussel.hoofdstuk10.inheritenceDemo;

public class AngryCat extends Mammal{
    public AngryCat(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("eats humans");
    }
}
