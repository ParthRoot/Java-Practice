import java.lang.Math;
import java.util.Scanner;
class square{
    int side;
    public void setSide(){
        System.out.println("Enter the side here: ");
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
    }
    public int area(){
        int area;
        area = (int) Math.pow(side,2);
        return area;
    }

    public int parameter(){
        int parameter;
        parameter = 4*side;
        return parameter;
    }
}
public class oop_practice_set_3 {
    public static void main(String[] args) {
        square a = new square();
        a.setSide();
        System.out.println("Area = "+a.area());
        System.out.println("Parameter = "+a.parameter());
    }
}
