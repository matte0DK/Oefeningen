package be.intecbrussel.hoofdstuk08.AutoAssociatiesUml;

public class Person {
    private String name;
    private int age;

    // constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
