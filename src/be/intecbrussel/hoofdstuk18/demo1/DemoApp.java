package be.intecbrussel.hoofdstuk18.demo1;

public class DemoApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("Sinterklaas is bij mij niet geweest dit jaar :(");

        // eerste manier, primitieve manier
        WordFilter wordFilter = new WordFilterImplementation();
        textPrinter.printFilteredWords(wordFilter);

        // tweede manier, anomnieme geneste klasse
        WordFilter anonFilter = new WordFilter() {
            @Override
            public boolean isValid(String word) {
                return word.length() > 5;
            }
        };
        textPrinter.printFilteredWords(anonFilter);

        // lambda is love
        System.out.println("\n contains e ");
        textPrinter.printFilteredWords(word -> word.contains("e"));

        System.out.println("\n smaller than 4");
        textPrinter.printFilteredWords(word -> word.length() > 4);

        System.out.println("\n bigger than five and stars with a");
        textPrinter.printFilteredWords2(word -> word.length() > 5, word -> word.toLowerCase().startsWith("a"));

        System.out.println("\n second letter is e");
        textPrinter.printFilteredWords(word -> word.charAt(1) == 'e');

        textPrinter.printFilteredWords(word -> false);

        System.out.println("\n contains e twice");
        textPrinter.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String word) {
                int amountOfE = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == 'e') {
                        amountOfE++;
                    }
                }
                return amountOfE == 2;
            }
        });

        textPrinter.printProcessedWords(word -> word.length() > 5, String::toUpperCase); // uitleg zie methodereferenties!

        // word is de parameter die we meegeven, meerdere parameters worden meegegeven binnen haakjes(..., ..., ...).
        // Java herkent de parameter door de gegeven parameter in de methode van de functionele interface.

        textPrinter.printFilteredWords(word -> word.length() > 5);

        // statische methodereferentie!
        textPrinter.printFilteredWords(DemoApp::isValid); // word -> isValid(word)

        // gebonden methodereferentie!
        DemoApp appObject = new DemoApp();
        textPrinter.printFilteredWords(appObject::isDefValid); // word -> appObject.isDefValid(word)

        // ongebonden methodereferentie
        textPrinter.printFilteredWords(String::isEmpty); // word -> word.isEmpty()

        // constructorreferentie
        textPrinter.printFilteredWords(Boolean::new); // word -> new Boolean(word)

        WordFilter wordFilter1 = word -> word.length() > 5;
        textPrinter.printFilteredWords(wordFilter);
    }

    public static boolean isValid(String word) {
        return true;
    }

    public boolean isDefValid(String word) {
        return true;
    }
}
