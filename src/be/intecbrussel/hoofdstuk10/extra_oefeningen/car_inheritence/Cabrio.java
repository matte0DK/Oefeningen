package be.intecbrussel.hoofdstuk10.extra_oefeningen.car_inheritence;

public class Cabrio extends Car {
    private boolean sunroof;

    // constructor
    public Cabrio(String color, int hp) {
        super(color, hp);
    }

    // setter
    public void openSunroof() {
        this.sunroof = !this.sunroof;
    }

    // getter
    public boolean getSunRoof() {
        return this.sunroof;
    }

    // toString
    @Override
    public String toString() {
        return "Cabrio{" +
                "sunroof=" + sunroof +
                "} " + super.toString();
    }
}


//    @Override
//    public int getSpeed() {
//        return super.getSpeed();
//    }