package be.intecbrussel.hoofdstuk10.oefeningen_boek.animals;

public class Snake extends Animal {

    public Snake() {
        this("SALAZAR");
    }
    public Snake(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println("a snake slither's");
    }

    @Override
    public void makeNoise() {
        System.out.println("some be hissing, some be rattling, some be rubbing xD");
    }

    @Override
    public String toString() {
        return "Snake" + super.toString();
    }
}
