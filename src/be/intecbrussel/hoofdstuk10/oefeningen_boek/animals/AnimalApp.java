package be.intecbrussel.hoofdstuk10.oefeningen_boek.animals;

public class AnimalApp {
    public static void main(String[] args) {
        Animal nero = new Cat("Nero");
        Animal vito = new Cat("Vito");

        Animal mySnake = new Snake();
        Animal myFish = new Fish();
        Animal myBird = new Bird();

        System.out.println(nero.toString());
        System.out.println();
        System.out.println(vito.toString());
        System.out.println();
        System.out.println(myBird.toString());
        System.out.println();
        System.out.println(mySnake.toString());
        System.out.println();
        System.out.println(myFish.toString());
    }
}
