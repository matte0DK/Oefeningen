package be.intecbrussel.hoofdstuk10.extra_oefeningen.car_inheritence;

public class SUV extends Car {
    private boolean bullBar;
    private boolean isAWDon;

    // constructor
    public SUV(String color, int hp) {
        super(color, hp);
    }

    // setter
    public void setBullBar(boolean bullBar) {
        this.bullBar = bullBar;
    }

    // getter
    public boolean getBullBar() {
        return this.bullBar;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed(); /*return 0;*/
    }

    @Override
    public void accelerate(int amount) {

//        WITHOUT SETTER
        if (this.isAWDon && getSpeed() + amount + getHp() / 100 > 30) {
            super.accelerate(30 - getSpeed() - getHp() / 100);
        } else {
            super.accelerate(amount);
        }

//        WITH SETTER
//        super.accelerate(amount);
//        if (isAWDon && getSpeed() > 30) {
//            setSpeed(30);
//        }

    }

    // functionality
    public void allWheelDrive(boolean ofRoad) {

        this.isAWDon = ofRoad;
        if (isAWDon && getSpeed() > 30) {
            // this.speed -= (amount + (hp/100))
            // 30 = speed - (amount + (hp/100))
            // 30 + (amount + (hp/100)) = speed
            // amount = speed - 30 - (hp/100)
            slow(getSpeed() - 30 - getHp());
        }
    }

    @Override
    public String toString() {
        return "SUV{" +
                "bullBar=" + bullBar +
                ", isAWDon=" + isAWDon +
                "} " + super.toString();
    }
}
// MIJN AllWheelDrive METHODE

//    public void allWheelDrive(boolean ofRoad) {
//        if (ofRoad) {
//            if (getSpeed() < 30) {
//                super.getSpeed();
//            } else {
//                slow(getSpeed() - 30);
//            }
//        } else {
//            super.getSpeed();
//        }
//    }