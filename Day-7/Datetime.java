
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datetime {
    public static void main(String[] args) {

        // 1. LocalTime
        LocalTime t = LocalTime.now();
        System.out.println("Local Time: " + t);
        System.out.println(t.plusHours(2));

        // 2. LocalDate
        LocalDate d = LocalDate.now();
        System.out.println("\nLocal Date: " + d);
        System.out.println(d.plusDays(1));

        // 3. LocalDateTime
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("\nLocal DateTime: " + dt);

        // 4. ZonedDateTime
        ZonedDateTime z = ZonedDateTime.now(
            ZoneId.of("Asia/Kolkata"));
        System.out.println("\nZoned DateTime: " + z);

        // 5. Period
        LocalDate d1 = LocalDate.of(2020, 1, 1);
        Period p = Period.between(d1, d);
        System.out.println("\nPeriod: " + p.getYears() + " years");

        // 6. Duration
        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(12, 30);
        Duration dur = Duration.between(t1, t2);
        System.out.println("\nDuration: " + dur.toHours() + " hours");
        System.out.println(dur.toMinutes() + " minutes");

        // 7. DateTime Formatting
        DateTimeFormatter f =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a");
        System.out.println("\nFormatted DateTime: " + dt.format(f));
    }
}
