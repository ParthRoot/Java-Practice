import java.lang.reflect.Field;
public class type_casting {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(((Object)a).getClass().getSimpleName());
        double b = a;
        System.out.println(b);
        System.out.println(((Object)b).getClass().getSimpleName());
    }

}
