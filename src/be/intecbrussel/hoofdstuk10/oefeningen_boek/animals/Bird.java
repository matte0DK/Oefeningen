package be.intecbrussel.hoofdstuk10.oefeningen_boek.animals;

public class Bird extends Animal {

    public Bird() {
        this("FALCON");
    }
    public Bird(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println("bird's fly, up in the sky");
    }

    @Override
    public void makeNoise() {
        System.out.println("some birds sing, some tweet, and some shriek");
    }

    @Override
    public String toString() {
        return "Bird" + super.toString();
    }
}
