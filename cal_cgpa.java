import java.util.*;
class cal_cgpa
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the marks of English:-");
       int a = sc.nextInt();
       System.out.println("Enter the marks of Gujarati:-");
       int b = sc.nextInt();
       System.out.println("Enter the marks of Hindi:-");
       int c = sc.nextInt();
       System.out.println("Enter the marks of Maths:-");
       int d = sc.nextInt();    
       System.out.println("Enter the marks of Science:-");
       int e = sc.nextInt();
       int total = (a + b + c + d + e)/5;
       int cgpa = (total/90)*10;
       System.out.println("CGPA:-"+cgpa);



    }
}