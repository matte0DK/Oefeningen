package be.intecbrussel.hoofdstuk11.opdracht01;

public class PlanetEnum {

    public static void main(String[] args) {

        Planet[] solarSystem = Planet.values();

        for (Planet planet :
                solarSystem) {
            System.out.println(planet.toString());
        }
    }
}
