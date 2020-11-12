package be.intecbrussel.hoofdstuk10.oefeningen_boek.animals;

public abstract class Animal {
    private String name;

    public Animal() {

    }
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void move();
    public abstract void makeNoise();

    @Override
    public String toString() {
        return " (Animal), " +
                "name => '" + name + '\'';
    }
}
