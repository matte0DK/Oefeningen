package be.intecbrussel.hoofdstuk13.opdracht03;

public interface Pig {
    void grunt();

    default void fly() {
        System.out.println(
                "Spider Pig!\n" +
                "Spider Pig!\n" +
                "Does whatever a spider pig does!\n" +
                "Can he swing from a web?No he can't\n" +
                "He's a pig\n" +
                "Lookout!\n" +
                "He is the spider pig!!");
    }
}
