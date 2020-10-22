package be.intecbrussel.codingBat;

public class WarmupNotString {
    public String notString(String str) {
        if (str.length() > 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not" + str;
    }
}