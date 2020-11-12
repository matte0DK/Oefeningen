package be.intecbrussel.hoofdstuk10.oefeningen_boek.animals;

public class Cat extends Animal {

    public Cat() {
        this("VITO");
    }
    public Cat(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println("run with four feet");
    }

    @Override
    public void makeNoise() {
        System.out.println("MEOW");
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
