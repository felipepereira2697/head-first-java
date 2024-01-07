import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class DateTimeUpdates {


    public static void localDateSample() {
        LocalDate localDate = new LocalDate.now();
        LocalDate d20230626 = new LocalDate.of(2023, 06, 26);
        LocalDate fromString = new LocalDate.parse("2023-06-26");

        boolean leapYear = localDate.isLeapYear();
        boolean isBefore = localDate.isBefore(d20230626);
        boolean isAfter = localDate.isAfter(fromString);

        LocalDate firstDayOfTheMonth = d20230626.with(TemporalAdjusters.firstDayOfMonth());

        System.out.println("First day of the month "+firstDayOfTheMonth);
        System.out.println("Is a leap year? "+leapYear);
    }

    public static void localTimeSample() {
        LocalTime localTime = new LocalTime.now();
        LocalTime sevenThirty = LocalTime.of(7,30);
        LocalTime nineThirty = sevenThirty.plusHours(2);
        boolean isBefore = sevenThirty.isBefore(nineThirty);

        System.out.println("localTimeSample - Check is before "+isBefore);
    }

    public static void localDateTimeSample() {
        LocalDateTime dateTime = LocalDateTime.of(2023, Month.JUNE,26, 10,30);
        System.out.println("localDateTimeSample --> "+dateTime);
    }
    // Important Feature
    public static void zoneIdSample() {
        ZoneId zoneId = ZoneId.of("Europe/Lisbon");
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        ZonedDateTime parsed = ZonedDateTime.parse("2023-06-26T20:00:00+01:00[Europe/Lisbon]");

        //Offset is a LocalDateTime with a determined offset
        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.JUNE, 26,20,0,0);
        ZoneOffset offset = ZoneOffset.of("+02:00");

        OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);

    }
}
