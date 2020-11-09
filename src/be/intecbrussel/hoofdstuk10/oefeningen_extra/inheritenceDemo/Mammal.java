package be.intecbrussel.hoofdstuk10.oefeningen_extra.inheritenceDemo;

public abstract class Mammal {
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    private String spine = "Default Spine";

    public Mammal(Mammal newMammal) {
        this.name = newMammal.name; }

    public String getSpine() { return this.spine; }

    public abstract void attack();

    public void setSpine(String spine) { this.spine = spine; }

}
