package be.intecbrussel.hoofdstuk12.opdrachten_boek;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatterApp {
    public static void main(String[] args) {

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        // parsing
        LocalDateTime dt = LocalDateTime.parse("17/01/1997 07:38:43", myFormatter);


        System.out.println(myFormatter.format(dt));
        System.out.println(isoFormatter.format(dt));

        // formatteren zoals bij toString
        LocalDateTime now = LocalDateTime.now();
        System.out.format("%1$td/%1$tm/%1$tY %1$tH:%1$tM:%1$tS" , now);

        Scanner keyboard = new Scanner(System.in);
        String user = keyboard.next();

    }
}
