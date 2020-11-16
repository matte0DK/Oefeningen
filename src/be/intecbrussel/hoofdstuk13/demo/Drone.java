package be.intecbrussel.hoofdstuk13.demo;

public class Drone implements Flyable, FuelConsumer{
    private int propellerCount;

    @Override
    public  void fly() {
        System.out.println("Woosh Woosh propellers on");
    }

    @Override
    public void consumeFuel(int amount) {

    }
}
