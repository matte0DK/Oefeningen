package be.intecbrussel.hoofdstuk10.inheritenceDemo;

public class Human extends Mammal{

    private String spine = "Human Spine";

    // setters
    @Override
    public void setSpine(String spine) { this.spine = spine; }

    // getters
    @Override
    public String getSpine() { return this.spine; }

    @Override
    public void attack() {
        System.out.println("humans can shoot each other");
    }

    public String getDefaultSpine() { return super.getSpine(); }


}
