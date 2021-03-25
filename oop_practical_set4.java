import java.util.Scanner;
class rectangle{
    int l;
    int b;
    public void setSides(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of l");
        l = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
    }
    public int area(){
        int area;
        area = l * b;
        return area;
    }
    public int parimeter(){
        int parimeter;
        parimeter = (2*l)+(2*b);
        return parimeter;
    }
}
public class oop_practical_set4 {
    public static void main(String[] args) {
        rectangle a = new rectangle();
        a.setSides();
        System.out.println("Area: "+a.area());
        System.out.println("Parimeter: "+a.parimeter());

    }
}
