
public class string_ex
{
    public static void main(String[] args)
    {
        String s = new String("Hello");
        System.out.println(s);
        String s1 = new String("Hello");
        String s2 = new String("World");
        System.out.println(s2);
        System.out.println(s.hashCode()); // address 69609650
        System.out.println(s1.hashCode());// address 69609650
        System.out.println(s2.hashCode()); // address 83766130
        String s3 = "Hello";
        String s5 = "Hello";
        System.out.println(s3);
        System.out.println(s5);
        System.out.println(s3.hashCode());
        System.out.println(s5.hashCode());

    }
}