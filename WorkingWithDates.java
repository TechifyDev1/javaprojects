import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDates {

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
        LocalTime myObjTime = LocalTime.now();
        System.out.println(myObjTime);
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE-MMMM-yyyy HH:mm:ss");
        String formatttedDate = myDateTime.format(dateTimeFormatter);
        System.out.println(formatttedDate);
    }
}