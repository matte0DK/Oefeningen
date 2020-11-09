package be.intecbrussel.hoofdstuk10.oefeningen_extra.car_inheritence;

public class Electric extends Car {
    private int battery;

    public Electric(String color, int battery) {
        super(color);
        this.battery = battery;
    }

    @Override
    public void accelerate(int amount) {
        if (amount < 0) {
            slow(-amount);
        } else {
            super.accelerate(amount + this.battery/100 - getHp()/100); // - getHp()/100) = is om de -gethp/100 uit Car accelerate te cancelen aangezien men hier geen bewerking doet met de hp maar met de battery.
        }

    }

    @Override
    public void slow(int amount) {
        if (amount < 0) {
            accelerate(-amount);
        } else {
            super.accelerate(amount + this.battery/100 - getHp()/100);
        }
    }

    @Override
    public void park() {
        super.park();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    public void charge(int amount) {
        this.battery += amount;
    }

    @Override
    public String toString() {
        return "Electric{" +
                "battery=" + battery +
                "} " + super.toString();
    }
}
