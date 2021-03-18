import java.util.Scanner;
class sum_three_num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:-");
        int a = sc.nextInt();
        System.out.println("Enter the number 2:-");
        int b = sc.nextInt();
        System.out.println("Enter the number 3:-");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Sum = "+sum);
    }
}