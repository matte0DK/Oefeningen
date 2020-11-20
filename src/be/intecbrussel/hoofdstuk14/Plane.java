package be.intecbrussel.hoofdstuk14;

public class Plane {

    private String name;



    // Nested Class
    public static class Pilot {
        private String name;
        private int age;
        private boolean hasLicence;

        public Pilot(String name, int age, boolean hasLicence) {
            this.name = name;
            this.age = age;
            this.hasLicence = hasLicence;
        }
    }
}
