import java.util.Calendar;

public class JavaGregorialCalender {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));


    }
}
