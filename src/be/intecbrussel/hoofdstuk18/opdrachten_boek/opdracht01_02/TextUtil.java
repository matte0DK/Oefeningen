package be.intecbrussel.hoofdstuk18.opdrachten_boek.opdracht01_02;

public interface TextUtil {
    public static String reverse(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString();
    }
}
