package be.intecbrussel.hoofdstuk14.opdrachten_boek;

public class Musician {

    public void play() {
        Instrument myInstrument = new Instrument() {
            @Override
            public void makeSound() {
                System.out.println("plays instrument");
            }
        };

        myInstrument.makeSound();

    }

    public class Instrument{

        public void makeSound() {
            System.out.println("Nice melody");
        }
    }

}
