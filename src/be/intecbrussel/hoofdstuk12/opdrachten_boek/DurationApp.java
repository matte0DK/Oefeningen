package be.intecbrussel.hoofdstuk12.opdrachten_boek;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationApp {
    public static void main(String[] args) {

        Instant now = Instant.now();
        Instant later = now.plusSeconds(500)
                            .plusMillis(2125698)
                            .plusNanos(456398);

        Duration duration = Duration.between(now, later);
        System.out.println(duration.getSeconds());

        long milliseconds = ChronoUnit.MILLIS.between(now, later);
        System.out.println(milliseconds);

        LocalDate nowDate = LocalDate.now();
        LocalDate birthDay = LocalDate.of(1997, 1, 17);

        long days = ChronoUnit.DAYS.between(nowDate, birthDay);
        long months = ChronoUnit.MONTHS.between(nowDate, birthDay);
        long years = ChronoUnit.YEARS.between(nowDate, birthDay);
        Period period = Period.between(nowDate, birthDay);

        System.out.println(days);
        System.out.println(months);
        System.out.println(years);
        System.out.println(period);


    }
}
