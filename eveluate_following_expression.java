// (v^2 - u^2)/2as
package Practice;
import java.util.*;
public class eveluate_following_expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of v: ");
        float v = sc.nextFloat();
        System.out.print("Enter value of u: ");
        float u = sc.nextFloat();
        System.out.print("Enter value of a: ");
        float a = sc.nextFloat();
        System.out.print("Enter value of s: ");
        float s = sc.nextFloat();
        float ans = (float) ((Math.pow(v,2) - Math.pow(u,2))/(2*a*s));
        System.out.println(ans);

    }

}
