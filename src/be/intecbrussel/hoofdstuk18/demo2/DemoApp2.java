package be.intecbrussel.hoofdstuk18.demo2;

import java.util.function.Predicate;

public class DemoApp2 {
    public static void main(String[] args) {
        Predicate condition = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

        Predicate<String> condition2 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };
    }
}
