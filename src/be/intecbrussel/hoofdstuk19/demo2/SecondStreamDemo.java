package be.intecbrussel.hoofdstuk19.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondStreamDemo {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
        method7();
        method8();
    }

    private static void method8() {
        IntStream stream = IntStream.range(0,30);
        stream = stream.filter(e -> e % 2 == 0);

        int[] arr = stream.peek(e -> System.out.println(e + " "))
                .toArray();
    }

    private static void method7() {
        List<Integer> list = new ArrayList<>();
        IntStream.range(0, 100)
                .peek(e -> list.add(e))
                .forEach(e -> System.out.println(e + " "));
    }

    private static void method6() {
        Random rng = new Random();
        IntStream.generate(() -> rng.nextInt(1000) % 2 == 0 ? 9999 : rng.nextInt(100))
                .limit(10)
                .forEach(number -> System.out.println(number + " "));
        System.out.println();
    }

    private static Integer privateMethod6() {
        Random rng = new Random();

        int x = rng.nextInt(20);
        while (x < 11) {
            x = rng.nextInt(20);
        }
        return x;
    }

    // COLLECTORS
    private static void method5() {
        IntStream.range(0,1000)
                .filter(number -> number % 3 == 0 && number % 4 == 0 && number % 8 == 0)
                .forEach(number -> System.out.println(number + " "));
        System.out.println();

        IntStream.range(0,1000)
                .filter(value -> value % 3 == 0)
                .filter(value -> value % 4 == 0)
                .filter(value -> value % 8 == 0)
                .forEach(value -> System.out.println(value + " "));
        System.out.println();

        IntStream.range(0,1000)
                .filter(number -> number % 24 == 0)
                .forEach(number -> System.out.println(number + " "));
        System.out.println();

        int[] numbersDividableBy24 = IntStream.range(0,1000)
                .filter(number -> number % 24 == 0)
                .toArray();

        Arrays.stream(numbersDividableBy24).forEach(e -> System.out.println(e + " "));
        System.out.println();

        Arrays.stream(numbersDividableBy24).forEach(e -> System.out.println(e + " "));
        System.out.println();

        List<Integer> numberlist1 = IntStream.range(0,1000)
                .filter(number -> number % 24 == 0)
                .mapToObj(number -> number)
                .collect(Collectors.toCollection(ArrayList :: new));

        numberlist1.forEach(e -> System.out.println(e + " "));
        System.out.println();
    }

    // REDUCERS
    private static void method4() {
        System.out.println((IntStream.range(0, 30).min().getAsInt()));
        System.out.println((IntStream.range(0, 30).max().getAsInt()));
        System.out.println((IntStream.range(0, 30).average().getAsDouble()));
        System.out.println((IntStream.range(0, 30).sum())); // DDT, don't do it like this, without isPresent check = not ok.

        System.out.println(IntStream.range(0, 30).reduce(1, (carry, e) -> carry * e)); // carry = we carry over a certain value(data).

        String[] combatants = new String[] { "Shelbatre ", "Matteo ", "Mert ", "Salai "};

        String title = Stream.of(combatants)
                .reduce("The battle of tonight: ", (acc, el) -> acc + el + " VS ");
        System.out.println(title);
        System.out.println(title.substring(0, title.length()-3)); // om vs op het einde af te kappen.
    }

    // GENERATORS
    private static void method3() {
        Stream.generate(() -> "Anthony is sus >:(")
                .limit(10)
                .forEach(e -> System.out.println(e + " "));
    }

    private static void method2() {
        IntStream.iterate(10,i -> i + 5)
                .limit(5)
                .forEach(e -> System.out.println(e + " "));
        System.out.println();
    }

    private static void method1() {
        IntStream.range(0,10)
                .forEach(number -> System.out.println(number + " "));
        System.out.println();

        IntStream.rangeClosed(0,10)
                .forEach(e -> System.out.println(e + " "));
        System.out.println();
    }
}

//        VOORBEELD SEED
//        Random rng1 = new Random(7777);
//        Random rng2 = new Random(8888);
//        Random rng3 = new Random(7777);
//
//        System.out.println(rng1.nextInt(10));
//        System.out.println(rng2.nextInt(10));
//        System.out.println(rng3.nextInt(10));