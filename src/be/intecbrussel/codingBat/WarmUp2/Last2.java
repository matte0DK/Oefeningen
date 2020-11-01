package be.intecbrussel.codingBat.WarmUp2;

public class Last2 {
    public int last2(String str) {
        if (str.length() < 2) {throw new IllegalArgumentException ("string is too short!");}

        String end = str.substring(str.length()-2);
        int count = 0;

        for (int i = 0; i < str.length() -2 ; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {
                count++;
            }
        } return count;
    }
}
