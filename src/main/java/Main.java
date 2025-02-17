import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(ZonedDateTime.now());
        System.out.println(localDateTime);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String nowDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(nowDateTime);
    }
}
