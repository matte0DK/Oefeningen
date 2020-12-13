package be.intecbrussel.hoofdstuk08_09.associaties.compositie;

public class House {

    private Room kitchen = new Room("kitchen");
    private Room bathRoom = new Room("bathroom");
    private Room livingRoom = new Room("living-room");
    private Room sleeingRoom = new Room("sleeping-room");

    // Instanties van de kamers worden gecreëerd op het moment dat we onze 'House' klasse schrijven.
}
