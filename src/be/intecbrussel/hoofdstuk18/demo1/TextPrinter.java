package be.intecbrussel.hoofdstuk18.demo1;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter) {
        for (String word : sentence.split(" ")) {
            if (filter.isValid(word))
            System.out.println(word);
        }
    }

    public void printFilteredWords2(WordFilter filter, SecondWordFilter secondWordFilter) {
        for (String word : sentence.split(" ")) {
            if (filter.isValid(word) && secondWordFilter.isValid(word))
                System.out.println(filter.isValid(word) && secondWordFilter.isValid(word));
        }
    }

    public void printProcessedWords(WordFilter filter, WordProcessor processor) {
        for (String word : sentence.split(" ")) {
            if (filter.isValid(word))
                System.out.println(processor.processWord(word));
        }
    }
}
