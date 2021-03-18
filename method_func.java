import java.util.Scanner;

public class method_func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the value of x: ");
            int x = sc.nextInt();
            System.out.print("Enter the value of y: ");
            int y = sc.nextInt();
            method_func obj = new method_func(); // create objec to call the functions

            System.out.println("1: Addition, 2: Substartion, 3: Multiplication, 4: Division, 5: Module");
            System.out.print("Select the opration: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Perform Addition");
                    int v = addition(x, y);
                    System.out.println("Addition:-" + v);
                    break;
                case 2:
                    System.out.println("Perform Substartion");
                    int v1 = obj.substartion(x, y);
                    System.out.println("Substartion:-" + v1);
                    break;
                case 3:
                    System.out.println("Perform Multiplication");
                    int v2 = multiplication(x, y);
                    System.out.println("Multiplication:-" + v2);
                    break;
                case 4:
                    System.out.println("Perform Division");
                    float v3 = obj.division(x, y);
                    System.out.println("Division:-" + v3);
                    break;
                case 5:
                    System.out.println("Perform Module");
                    int v4 = obj.module(x, y);
                    System.out.println("Module:-" + v4);
                    break;
                default:
                    System.out.println("You select wrong choice:");
            }
        }


    }

    static int addition(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    static int multiplication(int a, int b) {
        int c;
        c = a * b;
        return c;
    }

    int substartion(int a, int b) {
        int c;
        c = a - b;
        return c;
    }

    float division(int a, int b) {
        float c;
        c = a / b;
        return c;
    }

    int module(int a, int b) {
        int c;
        c = a % b;
        return c;
    }
}
