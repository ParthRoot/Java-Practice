package Practice;
import java.util.Scanner;
public class numIsGreaterorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numner here: ");
        int a = sc.nextInt();
        int v = 500;
        if(v < a){
            System.out.println(a+"is greater than given number");
        }
        else{
            System.out.println(a+"is less than give number");
        }
    }
}
