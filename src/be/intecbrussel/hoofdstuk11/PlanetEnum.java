package be.intecbrussel.hoofdstuk11;

public class PlanetEnum {
    public enum Planet {

        MERCURY(3.302 * (Math.pow(10, 24)), 57.91 * (Math.pow(10, 6))),
        VENUS(4.856 * (Math.pow(10, 24)), 1.0821 * (Math.pow(10, 8))),
        EARTH(5.972 * (Math.pow(10, 24)), 149.6 * (Math.pow(10, 6))),
        MARS(6.418 * (Math.pow(10, 23)), 2.279 * (Math.pow(10, 8))),
        JUPITER(1.899 * (Math.pow(10, 27)), 7.7841 * (Math.pow(10, 8))),
        SATURN(5.685 * (Math.pow(10, 26)), 1.426 * (Math.pow(10, 9))),
        URANUS(8.683 * (Math.pow(10, 25)), 2.88 * (Math.pow(10, 9))),
        NEPTUNE(1.0243 * (Math.pow(10, 26)), 4.498 * (Math.pow(10, 9))),
        PLUTO(1.302 * (Math.pow(10, 22)), 5.9068 * (Math.pow(10, 9)));

        private final float mass;
        private final float distance;

        private Planet(double mass, double distance) {
            this.mass = (float) mass;
            this.distance = (float) distance;
        }

        @Override
        public String toString() {
            return name() + ", mass= " + mass + "(kg)" +
                    ", distance= " + distance + "(km)" +
                    "} ";
        }
    }

    public static void main(String[] args) {

        Planet[] solarSystem = Planet.values();

        for (Planet planet :
                solarSystem) {
            System.out.println(planet.toString());
        }
    }
}
