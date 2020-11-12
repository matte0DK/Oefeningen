package be.intecbrussel.hoofdstuk10.oefeningen_boek.animals;

import be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics.Shape;

public class Fish extends Animal {

    public Fish() {
        this("NEMO");
    }
    public Fish(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println("a fish swim's");
    }

    @Override
    public void makeNoise() {
        System.out.println("blub blub...");
    }

    @Override
    public String toString() {
        return "Fish" + super.toString();
    }
}
