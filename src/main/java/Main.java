import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("ZoneDateTame: " + zonedDateTime);
        System.out.println("LocalDateTime: " + localDateTime);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String nowDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(nowDateTime);

        System.out.println("Plus 2 Wochen: " + zonedDateTime.plusWeeks(2));
    }
}
