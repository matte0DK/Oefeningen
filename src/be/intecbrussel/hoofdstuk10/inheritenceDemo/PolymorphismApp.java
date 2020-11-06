package be.intecbrussel.hoofdstuk10.inheritenceDemo;

public class PolymorphismApp {
    public static void main(String[] args) {
        Mammal myMammal = new Human();
        Human myHuman = new Human();

        System.out.println(((Human)myMammal).getDefaultSpine()); // superClass var
        System.out.println(myHuman.getDefaultSpine()); // subClass var
    }
}
