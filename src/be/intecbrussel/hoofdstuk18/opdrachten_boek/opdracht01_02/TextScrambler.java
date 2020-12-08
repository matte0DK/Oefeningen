package be.intecbrussel.hoofdstuk18.opdrachten_boek.opdracht01_02;

public class TextScrambler {
    public String scramble(String word) {
            return word.replaceAll("a", "@")
                        .replaceAll("e", "$")
                        .replaceAll("l", "e")
                        .replaceAll("o", "O");
    }
}
