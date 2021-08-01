
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimex {
    public static void main(String [] args)
    {
        // Create an object of LoacalDate type
        LocalDate date = LocalDate.now();
        // .now() method to tore the current date

        // Print current date
        System.out.println(date);

        // Create date time object and store current time in
        // default format yy-mm-dd
        LocalDateTime localDateTime= LocalDateTime.now();


        // Creating DateTimeFormatter object
        // to specify date format
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Change date into your format and store it in
        // string object
        String formattedDate = date.format(dateTimeFormatter);

        // Print formatted date
        System.out.println(formattedDate);

        DateTimeFormatter myDateFormat
                = DateTimeFormatter.ofPattern(
                "EEEE, dd MMM yyyy");
        // e.g- MMM = Oct and MMMM = October

        // Change date into req format and store it in
        // string object
        String formattedDate1 = date.format(myDateFormat);

        // Printing formatted date
        System.out.println(formattedDate1);
    }
}
