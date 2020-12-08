package be.intecbrussel.hoofdstuk18.opdrachten_boek.opdracht01_02;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        // Opdracht 1 + 2
        TextPrinter tp = new TextPrinter("Sinterklaas is bij mij niet geweest dit jaar :(");

        tp.printFilteredWords(word -> word.contains("e"));
        tp.printFilteredWords(word -> word.length() > 4);
        tp.printFilteredWords(word -> word.startsWith("a"));
        tp.printFilteredWords(word -> word.length() > 1 && word.charAt(1) == 'e');
        tp.printFilteredWords(word -> containsLetterTwice(word, 'e'));

        tp.printProcessedWords(TextUtil :: reverse);

        TextScrambler ts = new TextScrambler();
        tp.printProcessedWords(ts :: scramble);

        tp.printProcessedWords(String :: toLowerCase);

        tp.printNumberValues(BigDecimal :: new);

        // Opdracht 3
        Predicate<String> p1 = word -> word.contains("e");
        Predicate<String> p2 = word -> word.contains("a");
        tp.printFilteredWords(p1.and(p2));

        Function<String, String> f1 = word -> word.toLowerCase();
        Function<String, String> f2 = TextUtil :: reverse;
        tp.printProcessedWords(f1.andThen(f2));

        TextPrinter tp3 = new TextPrinter("this is another sentence to present.");
    }

    private static boolean containsLetterTwice(String word, char character) {
        int count = 0;
        for (char ch :
                word.toCharArray()) {
            if (ch == character) {
                count++;
            }
        }
        return count == 2;
    }


}
