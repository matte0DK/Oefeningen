package be.intecbrussel.hoofdstuk04;

public class OpdrachtVijfHoofdstukVijf {
    public static void main(String[] args) {

        byte a = 4 ;
        byte b = 2;
        byte c = (byte) (a * b);
//        Casten naar byte en literals tussen haakjes plaatsen want byte maal int blijft een int.
//        Beiden moeten dus gelezen worden als een byte.
        System.out.println(c);

//        int d = 2147483645;
//        int f = 2147483642;
//        int e = d * f;
//        Dit geeft een fout resultaat omdat de waarden te groot zijn.

        int d = 2147483645;
        int e = 2147483642;
        long f = (long) e * d;
//        juist antwoord.

        System.out.println(f);

    }

}
