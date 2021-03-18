package Practice;
import java.util.Scanner;
public class km_to_miles_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the kilometer here: ");
        float a = sc.nextInt();
        km_to_miles_converter obj = new km_to_miles_converter();
        float v = obj.miles_converter(a);
        System.out.println("Miles: "+v);


    }

    float miles_converter(float a){
        float mi;
        mi = a * 0.62137f;
        return mi;
    }
}
