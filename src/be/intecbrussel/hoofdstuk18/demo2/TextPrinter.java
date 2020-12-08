package be.intecbrussel.hoofdstuk18.demo2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(Predicate<String> condition) {
        for (String word : sentence.split(" ")) {
            if (condition.test(word)) {
                System.out.println(word);
            }
        }
    }
    
    public void parseInt(Function<String, Integer> parser) {
        for (String word :
                sentence.split(" ")) {
            Integer numberForWord = parser.apply(word);
            System.out.println(numberForWord * 100);
        }
    }
    
    public void forEach(Consumer<String> action) {
        for (String word :
                sentence.split(" ")) {
            action.accept(word);
        }
    }
}
