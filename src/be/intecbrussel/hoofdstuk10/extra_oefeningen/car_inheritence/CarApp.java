package be.intecbrussel.hoofdstuk10.extra_oefeningen.car_inheritence;

public class CarApp {
    public static void main(String[] args) {

        Car myCabrio = new Cabrio("yellow", 200);
        Car myRam = new SUV("Red", 250);
        Car myTesla = new Electric("green", 60);

        Car[] carArray = new Car[] { myCabrio, myRam, myTesla};

        for (Car car :
                carArray) {
            car.accelerate(50);
        }

        for (Car car :
                carArray) {
            System.out.println(car);
        }

        for (Car car :
                carArray) {
            car.park();
        }

        for (Car car :
                carArray) {
            System.out.println(car);
        }
    }
}

//  TESTS
//        SUV myTruck = new SUV();
//        System.out.println(myTruck.getSpeed());
//        myTruck.allWheelDrive(true);
//        System.out.println(myTruck.getSpeed());
//
//        Electric myTesla = new Electric();
//        myTesla.accelerate(10);
//        System.out.println(myTesla.getSpeed());