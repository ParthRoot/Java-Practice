import java.util.Scanner;
public class user_input_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] a = new int[5];
        int sum = 0;
        int   i;
        System.out.println("Enter the array element here:");
        for(i=0;i<a.length;i++)
        {
            System.out.print("Enter the array element " +i+ "-: ");
            a[i] = sc.nextInt();
            sum += a[i];

        }
        System.out.println("Sum:-"+sum);


    }
}
