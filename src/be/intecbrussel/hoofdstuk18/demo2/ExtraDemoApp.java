package be.intecbrussel.hoofdstuk18.demo2;

import java.util.function.Predicate;

public class ExtraDemoApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("blablablablabla blablabla");

        TextPrinter tp2 = new TextPrinter(" 55 55 55 55 55");

        tp.printFilteredWords(word -> word.length() > 5);
        tp.parseInt(Integer::parseInt);

        tp.forEach(word -> System.out.println(word.toUpperCase()));

        Predicate<String> cond1 = word -> word.length() > 4;
        Predicate<String> cond2 = word -> word.startsWith("s");
        Predicate<String> combinedCondition = cond1.and(cond2);
        Predicate<String> condition1 = cond1.or(cond2);
        Predicate<String> condition2 = cond1.negate();
        Predicate<String> condition3 = Predicate.not(cond1);
        Predicate<String> condition4 = Predicate.isEqual(null);
    }
}
