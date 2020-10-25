package be.intecbrussel.hoofdstuk05;

public class Opdracht17_8 {public static void main(String[] args) {

    for (int number = 2 ; number <= 1_000 ; number++) {

        //methode om te bepalen of nummer prime is

        boolean isPrime = true;

        for (int dividers = 2; dividers <= Math.sqrt(number); dividers++) {
            if (number % dividers == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number);

//                tot hier de te kennen opdracht
        }

    }


//        int counter = 0;
//        System.out.println(2);
////        List<Integer> primeList = new ArrayList<>();
//
//        for (int number = 1_000_000 ; number <= 2_000_000 ; number += 2) {
//            boolean isPrime = true;
//
//            for (Integer dividers : primeList) {
//                if (dividers > Math.sqrt(number)) {
//                    break;
//                }
//
//                if (number % dividers == 0) {
//                    isPrime = false;
//                    break;
//            }
//
//
//            }
//
//            if (isPrime) {
//                counter++;
//                primeList.add(number);
//                System.out.println(number);
//            }
//
//        }
//
//
}
}
