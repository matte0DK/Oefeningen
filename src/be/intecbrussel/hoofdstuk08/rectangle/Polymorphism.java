package be.intecbrussel.hoofdstuk08.rectangle;

public class Polymorphism {
    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(5);
        System.out.println(rect.getHeight());

    }
}
