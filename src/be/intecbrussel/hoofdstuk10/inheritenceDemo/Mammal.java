package be.intecbrussel.hoofdstuk10.inheritenceDemo;

public abstract class Mammal {

    private String spine = "Default Spine";

    public String getSpine() { return this.spine; }

    public abstract void attack();

    public void setSpine(String spine) { this.spine = spine; }

}
