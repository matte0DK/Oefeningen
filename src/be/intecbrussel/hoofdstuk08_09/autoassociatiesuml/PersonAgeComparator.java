package be.intecbrussel.hoofdstuk08_09.autoassociatiesuml;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(b.getAge(), a.getAge());
    }
}
