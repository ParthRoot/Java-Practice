import java.util.Scanner; 

public class User_Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:-");
        int a = sc.nextInt();
        System.out.println("Enter the number 2:-");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum:-"+sum);

        boolean x = sc.hasNextInt();
        System.out.println(x);
    }
    
}
