import java.util.Scanner;
public class multiple_if_else{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the age here:");
        int s = sc.nextInt();
        if (s > 10 || s < 20){
            if(s > 15){
                System.out.println("Your age is under 15 ");
            }
            else{
                System.out.println("Your age is greater than 15 but under 20 ");
            }

        }
        else if(s > 21 || s < 40){

            if(s > 25){
                System.out.println("Your age is under 25 ");
            }
            else{
                System.out.println("Your age is greater than 25 but under 40 ");
            }

        }
        else{

            System.out.println("Your age is greater than 40");
        }
        int a4 = 10;
        float a5 = a4;
        System.out.println(a5);

         
    }

     


}