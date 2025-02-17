import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("ZoneDateTame: " + zonedDateTime);
        System.out.println("LocalDateTime: " + localDateTime);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String nowDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(nowDateTime);

        ZonedDateTime zonedDateTimePlusTwoWeeks = zonedDateTime.plusWeeks(2);

        System.out.println("Plus 2 Wochen: " + zonedDateTimePlusTwoWeeks);
        System.out.println("Unterschied: " + ChronoUnit.DAYS.between(zonedDateTime, zonedDateTimePlusTwoWeeks) + " Tage");

        System.out.println(ChronoUnit.HALF_DAYS.between(zonedDateTime, zonedDateTimePlusTwoWeeks));
    }
}
