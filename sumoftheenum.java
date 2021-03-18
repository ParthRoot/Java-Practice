package Practice;
import java.util.Scanner;
public class sumoftheenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers here: ");
        System.out.print("Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Num2: ");
        int num2 = sc.nextInt();
        System.out.print("Num3: ");
        int num3 = sc.nextInt();

        sumoftheenum obj = new sumoftheenum();
        int v = obj.sum(num1,num2,num3);
        System.out.println("Sum = "+v);

    }

    int sum(int...arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
}
