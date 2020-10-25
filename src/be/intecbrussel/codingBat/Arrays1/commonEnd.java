package be.intecbrussel.codingBat.Arrays1;

public class commonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        if (a[a.length - 1] > 1 && b[b.length - 1] > 1) {
            if (a[0] == b[0]) {
                return true;
            }
            if (a[a.length - 1] == b[b.length - 1]) {
                return true;
            }
        }
        return false;
    }
}