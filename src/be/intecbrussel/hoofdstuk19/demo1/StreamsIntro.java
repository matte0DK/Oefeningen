package be.intecbrussel.hoofdstuk19.demo1;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamsIntro {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    public static void method1() {
        Integer[] intArr = new Integer[] {2,5,4,7,8,5,6,4,8,5,5};

        for (Integer integer :
                intArr) {
            System.out.println(integer + " ");
        }
        System.out.println();

        Stream.of(intArr).forEach(number -> System.out.println(number + " "));
    }

    private static void method2() {
        Integer[] intArr = new Integer[] {2,5,4,7,8,5,6,4,8,5,5};

        // print 3 eerste even getallen froter dan 4

        // FOR LOOP
        int count = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]%2 == 0 && intArr[i] > 4 && count < 3) {
                System.out.println(intArr[i]);
                count++;
            }
        }
        System.out.println();

        // STREAM
        Stream.of(intArr).filter(number -> number % 2 == 0)
                .filter(number -> number > 4)
                .limit(3)
                .forEach(number -> System.out.println(number + " "));
    }

    private static void method3() {

        Mammal[] mammals = new Mammal[5];
        mammals[0] = new Bird("Birb", 5, 1);
        mammals[1] = new JellyFish("Squidward", 10, 3);
        mammals[2] = new Bird("Patrick", 7, 2);
        mammals[3] = new JellyFish("Mr Krab", 40, 4);
        mammals[4] = new Bird("noName", 3, 5);

        // FOR LOOP gebruiken
        double sum = 0;
        int count = 0;
        for (int i = 0; i < mammals.length; i++) {
            if (mammals[i] != null) {
                sum += mammals[i].getWeight();
                count++;
            }
        }
        if (count > 0) {
            double avg = sum / mammals.length;
            System.out.println("Avg weight = " + avg);
        }

        // STREAMS! -> OptionalDouble stream -> extra methodes om met doubles om te gaan, specifieke methodes dus.
        OptionalDouble averageWeight = Stream.of(mammals)
                .filter(mammal -> mammal != null)
                .mapToDouble(mammal -> mammal.getWeight())
                .average();

        if (averageWeight.isPresent()) {
            System.out.println("Avg weight = " + averageWeight.getAsDouble());
        }
    }
}
