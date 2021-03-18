package Practice;
import java.util.Scanner;
public class checkNumberIsIntOrNot {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter the number here: ");
            Scanner sc = new Scanner(System.in);
            System.out.println(sc.hasNextInt());
        }
    }

}
