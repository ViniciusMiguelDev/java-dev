import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class localDate4 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        LocalDate NextWeekLocalDate = d04.plusDays(7);

        System.out.println(pastWeekLocalDate);
        System.out.println(NextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        LocalDateTime NextWeekLocalDateTime = d05.plusDays(7);
        LocalDateTime NextHourLocalDateTime = d05.plusHours(7);

        System.out.println(pastWeekLocalDateTime);
        System.out.println(NextWeekLocalDateTime);
        System.out.println(NextHourLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant NextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(NextWeekInstant);

        System.out.println();
        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);

        System.out.println();
        System.out.println(t1.toDays());
        System.out.println(t1.toHours());

        System.out.println();
        System.out.println(t2.toDays());
        System.out.println(t2.toHours());

        System.out.println();
        System.out.println(t3.toDays());
        System.out.println(t3.toHours());

    }
}
