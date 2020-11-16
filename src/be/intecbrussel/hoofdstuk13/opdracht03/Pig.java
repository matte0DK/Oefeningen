package be.intecbrussel.hoofdstuk13.opdracht03;

public interface Pig {
    void grunt();

    default void fly() {
        System.out.println("dumbo wants to fly");
    }
}
