package be.intecbrussel.hoofdstuk08_09.autoassociatiesuml;

public class Engine {
    private int fuel = 0;

    //    constructor
    public Engine(int fuel) {
        this.fuel = fuel;
    }

    //getter
    public int getFuel() {
        return fuel;
    }

    // Function Methods
    public void burnFuel(int amount) {
        this.fuel -= amount;
        if(this.fuel < 0) {
            this.fuel = 0;
        }
    }

    public void reFuel(int amount) {
        this.fuel += amount;
    }
}

//    DIT IS EEN ANDERE MANIER OM HETZELFDE TE BEREIKEN MAAR NIET GEVRAAGD IN DE OPDRACHT

//    public class Engine extends Car {
//        private int fuel;
//
//        //constructor
//        public Engine(String brand, int speed, Color color, be.intecbrussel.Engine engine, Person driver, int fuels) {
//            super (brand,speed, color, engine, driver);
//            this.fuel = fuels;
//        } => extention, treated the same as a composition.
