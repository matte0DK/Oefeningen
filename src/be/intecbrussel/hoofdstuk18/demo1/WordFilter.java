package be.intecbrussel.hoofdstuk18.demo1;

@FunctionalInterface
public interface WordFilter {
    boolean isValid(String word);
//    boolean isNotValid();
}

