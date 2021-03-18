package Practice;
import java.util.Scanner;
public class grad_encription_dicription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grade here: ");
        char c = sc.next().charAt(0);
        char grade =  (char)(c + 8);
        System.out.println(grade);
        char dgrade = (char)(grade - 8);
        System.out.println(dgrade);

    }
}
