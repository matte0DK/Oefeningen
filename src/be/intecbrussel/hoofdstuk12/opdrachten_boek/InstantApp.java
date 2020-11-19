package be.intecbrussel.hoofdstuk12.opdrachten_boek;

import java.time.Instant;

public class InstantApp {
    public static void main(String[] args) {

        Instant now = Instant.now();
        now.plusSeconds(7);
        now.plusMillis(5);
        now.plusNanos(3);

        System.out.println(now);
    }
}
