package be.intecbrussel.hoofdstuk08.circle;

public class CalculateCosinus {
    public static void main(String[] args) {
        double angle;
        for (double i = 0; i < Math.PI*2; i += 0.1) {
            angle = i * (180/Math.PI);
            System.out.println(Math.cos(angle));
        }
    }
}
