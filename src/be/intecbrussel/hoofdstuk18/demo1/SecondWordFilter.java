package be.intecbrussel.hoofdstuk18.demo1;

@FunctionalInterface
public interface SecondWordFilter {
    boolean isValid(String word);
}
