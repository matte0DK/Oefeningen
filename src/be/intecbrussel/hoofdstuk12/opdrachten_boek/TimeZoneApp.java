package be.intecbrussel.hoofdstuk12.opdrachten_boek;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneApp {
    public static void main(String[] args) {

        ZoneId london = ZoneId.of("Europe/London");
        ZoneId sydney = ZoneId.of("Australia/Sydney");
        ZoneId adelaide = ZoneId.of("Australia/Adelaide");
        ZoneId utc4 = ZoneId.of("UTC-4");

        ZonedDateTime myZone = ZonedDateTime.now();
        ZonedDateTime londonZone = ZonedDateTime.now(london);
        ZonedDateTime sydneyZone = ZonedDateTime.now(sydney);
        ZonedDateTime adelaideZone = ZonedDateTime.now(adelaide);
        ZonedDateTime utc4Zone = ZonedDateTime.now(utc4);

        System.out.println(myZone);
        System.out.println(londonZone);
        System.out.println(sydneyZone);
        System.out.println(adelaideZone);
        System.out.println(utc4Zone);

    }
}
