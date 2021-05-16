import java.util.Scanner;


class myException_1 extends Exception{
    @Override
    public String toString() {
        return "b is nonnegative";
    }
}


public class end_all_exception {
    static int hello_1(int a, int b) throws myException_1{
        if(b <= 0){
            throw new myException_1();
        }
        int c = a/b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        //simple exception
//        System.out.println("Enter the value of a: ");
//        a = sc.nextInt();
//        System.out.println("Enter the value of b: ");
//        b = sc.nextInt();
//
//        try{
//            int c = a/b;
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        //handle specific exception with finally block
//        while (true) {
//            int v[] = {25, 85, 69};
//            System.out.println("Enter the index here: ");
//            int ind = sc.nextInt();
//            System.out.println("Enter the n here: ");
//            int n = sc.nextInt();
//
//            try {
//                System.out.println("Index value is: " + v[ind] + "\nDevision:-" + v[ind] / n);
//                break;
//            } catch (ArithmeticException e) {
//                System.out.println(e);
//            } catch (ArrayIndexOutOfBoundsException e1) {
//                System.out.println(e1);
//            }
//            finally {
//                System.out.println("This is finally block");
//            }
//            System.out.println("This is end");
//        }

        //exception class
//        try{
//            throw new myException_1();
//        }
//        catch (myException_1 e){
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//        }
//
//        System.out.println("Enter the a: ");
//        a = sc.nextInt();
//        System.out.println("Enter the b: ");
//        b = sc.nextInt();
//        try {
//            System.out.println(hello_1(a, b));
//        } catch (myException_1 m1) {
//            System.out.println(m1);
//        }

        try {
            try {
                System.out.println("Enter the integer: ");
                int n = sc.nextInt();
            }

            catch (Exception e){
                System.out.println("This is not integer");
                System.out.println("Inner exception");
            }
        }

        catch (Exception e){
            System.out.println("OUTER EXCEPTION");
        }
    }
}
