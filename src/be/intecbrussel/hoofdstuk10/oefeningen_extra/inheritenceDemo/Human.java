package be.intecbrussel.hoofdstuk10.oefeningen_extra.inheritenceDemo;

public class Human extends Mammal{

    private String spine = "Human Spine";

    public Human(String name) {
        super(name);
    }

    public Human() { this("jolien"); }

    // setters
    @Override
    public void setSpine(String spine) { this.spine = spine; }

    // getters
    @Override
    public String getSpine() { return this.spine; }

    public String getDefaultSpine() { return super.getSpine(); }

    @Override
    public void attack() {
        System.out.println("humans can shoot each other");
    }

    public void eat() {
        System.out.println("we eating");
    }

}
