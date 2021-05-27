import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class javaDataTimeFormater {
    public static void main(String[] args) {
        /*LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        String s = dt.format(df);
        System.out.println(s);

        */

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd-mm-yyyy -- h:m:a");
        String s = df1.format(dt);
        System.out.println(s);
    }
}
