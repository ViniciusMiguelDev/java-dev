import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class localDate2 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + fmt1.format(d05));
        System.out.println("d05 = " + fmt2.format(d05));
        System.out.println("d05 = " + fmt4.format(d05));


        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));

        System.out.println();
        System.out.println(fmt1.format(d01));
        System.out.println(fmt2.format(d02));
    }
}
