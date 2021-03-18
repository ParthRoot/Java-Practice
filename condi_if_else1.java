import java.util.*;
public class condi_if_else1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        if (a > 10 && a < 20){
            System.out.println("number in between 10 and 20");
        }
        else{
            System.out.println("Number is greater than 20");
        }
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        if(b == 50 || b < 20){
            System.out.println("Yes! Your dicision in right");
        }
        else{
            System.out.println("No! Your discion in wrong");
        }

        Boolean c = true;
        System.out.println(!c);

        // tanary operator
        System.out.println("Enter the number d:");
        int d = sc.nextInt();
        String output = (d % 2== 0)?"even number":"odd number";
        System.out.println(output);


    }
}