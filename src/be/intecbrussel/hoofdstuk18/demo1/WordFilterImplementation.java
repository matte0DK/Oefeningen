package be.intecbrussel.hoofdstuk18.demo1;

public class WordFilterImplementation implements WordFilter {
    public boolean isValid(String word) {
        return word.length() > 5;
    }

//    @Override
//    public boolean isNotValid() {
//        return false;
//    }
}
