package be.intecbrussel.hoofdstuk10.oefeningen_extra.car_inheritence;

public class Car {
    private String color;
    private int speed;
    private int hp;

    // constructors
    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int hp) {
        this.color = color;
        this.hp = hp;
    }

    // public functions
    public void accelerate(int amount) {
        if (amount < 0) {
            slow(-amount);
        } else {
            this.speed += (amount + (hp / 100));
        }

    }

    public void slow(int amount) {
        if (amount < 0) {
            accelerate(-amount);
        } else {
            this.speed -= (amount + (hp / 100));    /* hele bewerking tussen haakjes plaatsen, want formule wordt van links naar rechts gelezen. => OF this.speed -= amount - (hp/100). */
        }
    }

    public void park(int amount) {
        amount = this.speed;
        this.speed -= amount;
    }

    public void park() {
        this.speed = 0;
    }

    //getters
    public int getSpeed() {
        return this.speed;
    }

    public String getColor() {
        return this.color;
    }

    public int getHp() {
        return this.hp;
    }

    // setters
    public void setColor(String color) {
        this.color = color;
    }

//    public void setSpeed(int speed) {
//        this.speed = speed;
//    } => niet gevraagd in Uml, but who kno's what they asked

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}
