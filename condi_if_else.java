import java.util.Scanner;

public class condi_if_else
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1:");
        int a = sc.nextInt();
        if(a < 10)
        {
            System.out.println("Sorry!, You can not play...................");
        }
        else
        {
            System.out.println("Welcome");
        }
    }
}