package be.intecbrussel.hoofdstuk14;

public class LocalNestedApp {

    public static void main(String[] args) {
        AngryPigeon ap = new AngryPigeon();
        Object pigeonObject = ap.throwPigeon();

        System.out.println(pigeonObject);
    }
}
