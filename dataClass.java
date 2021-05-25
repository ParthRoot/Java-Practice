import java.util.Date;

public class dataClass {
    public static void main(String[] args) {
        Date d = new Date();
        Date d1 = new Date(40 ,11,25,56,12,18);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d.getTime());
        System.out.println(d.getMonth());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
