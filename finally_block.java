import java.util.Scanner;

public class finally_block {
    public static int hello(int a, int b){
        try{
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally block");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
//        System.out.print("Enter the value of a: ");
//        a = sc.nextInt();
//        System.out.print("Enter the value of b: ");
//        b = sc.nextInt();

        //System.out.println(hello(a,b));

        while(true){
            System.out.print("Enter the value of a: ");
            a = sc.nextInt();
            System.out.print("Enter the value of b: ");
            b = sc.nextInt();
            try {
                int c = a/b;
                System.out.println(c);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("This is finally block");
            }
        }
    }
}
