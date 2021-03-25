import java.util.Scanner;
class circle{
    int r;

    public void setSides(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of r");
        r = sc.nextInt();
    }
    public double area(){
        double area;
        area =  (3.14 * Math.pow(r,2));
        return area;
    }
    public double parimeter(){
        double parimeter;
        parimeter =  (2*3.14*r);
        return parimeter;
    }
}
public class oop_practical_set_5 {
    public static void main(String[] args) {
        circle a = new circle();
        a.setSides();
        System.out.println("Area: "+a.area());
        System.out.println("Parimeter: "+a.parimeter());

    }
}
