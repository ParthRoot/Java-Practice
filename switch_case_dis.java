
import java.util.Scanner;

public class switch_case_dis{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the operation to perform:");
        int c = sc.nextInt();

            switch (c) {
                case 1:
                    int d = a + b;
                    System.out.println("Sum:" + d);
                    break;
                case 2:
                    int e = a - b;
                    System.out.println("Sub:" + e);
                    break;
                case 3:
                    int f = a * b;
                    System.out.println("Mul:" + f);
                    break;
                case 4:
                    float g = a / b;
                    System.out.println("Div:" + g);
                    break;
                case 5:
                    int h = a % b;
                    System.out.println("Mod:" + h);
                    break;
                default:
                    System.out.println("You chosen wrong operation");

            }

        }

    }   

}