package be.intecbrussel.hoofdstuk08_09.associaties.aggregatie;

public class Owner {
    private String name;
    private Pet pet;

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return this.name;
    }
}
