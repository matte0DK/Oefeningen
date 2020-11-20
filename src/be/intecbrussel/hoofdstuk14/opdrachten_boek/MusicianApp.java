package be.intecbrussel.hoofdstuk14.opdrachten_boek;

public class MusicianApp {

    public static void main(String[] args) {

        Musician myArtist = new Musician();
        myArtist.play();

        Musician.Instrument playSong = myArtist.new Instrument();
        playSong.makeSound();
    }
}
