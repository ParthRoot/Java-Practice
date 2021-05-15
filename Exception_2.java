import java.util.Scanner;

public class Exception_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = {15,65,36};

        int index;
        System.out.println("Enter the index here: ");
        index = sc.nextInt();
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        try {
            System.out.println("Selecting index value is: "+ a[index]);
            System.out.println("Performing division: "+a[index]/num);
        }

        catch (ArithmeticException e){
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1);
        }


        System.out.println("End of programme");
    }
}
