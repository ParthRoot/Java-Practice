import java.util.Scanner;
public class java_170321 {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        //  Strings
        //  String sc = new String("Hello World");
        //  System.out.println(sc);

       // String s1 = s.nextLine();
       // System.out.printf("This is the string %s", s1);

       // If.....ElseIf...Else
        /*
       boolean a = true;
       boolean b = true;

       if(a && b){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }

       if(a || b){
           System.out.println("Yes or");
       }
       else {
           System.out.println("No or");
       }

       if(a != b){
           System.out.println("Yes not");
       }
       else{
           System.out.println("No not");
       }


        // Switch
        System.out.println("Enter the vote here: ");
        int i = s.nextInt();
        switch (i){
            case 1:
                System.out.println("BJP");
                break;
            case 2:
                System.out.println("CONGRESS");
                break;
            case 3:
                System.out.println("AAP");
                break;
            default:
                System.out.println("NATO");
        }
        System.out.println("Enter the number here");
        int x = s.nextInt();
        int i = 1;
        // while loop
        while(i<=x){
            System.out.print(i+",");
            i++;
       }
        System.out.println("");
        //for loop
        for(i=1;i<=x;i++){
            System.out.print(i+",");
        }

         do{
            System.out.print(i+",");
            i++;
        }while (i<=x);
        */
        System.out.println("Enter the number here");
        int x = s.nextInt();
        int i = 1;

        for(i=1;i<=x;i++){
            if(i == 2){
                continue;
            }
            else{
                System.out.println(i+",");
            }

        }




    }
}
