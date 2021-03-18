package Practice;
import java.util.Scanner;
public class percantages_cal {
    public static void main(String[] args) {
        System.out.println("Marks Obtain in out of 100");
        System.out.println("Toatl Marks = 700");
        Scanner sc = new Scanner(System.in);
        System.out.print("Gujarati: ");
        int guj = sc.nextInt();
        System.out.print("English: ");
        int eng = sc.nextInt();
        System.out.print("Science: ");
        int sci = sc.nextInt();
        System.out.print("Maths: ");
        int mat = sc.nextInt();
        System.out.print("Hindi: ");
        int hin = sc.nextInt();
        System.out.print("PT: ");
        int pt = sc.nextInt();
        System.out.print("Social Science: ");
        int ss = sc.nextInt();

        percantages_cal obj = new percantages_cal();
        float p = obj.perc(guj,eng,hin,sci,ss,mat,pt);
        System.out.println("percantage "+p+"%");



    }

    float perc(int...arr){
        float perc = 0;
        for(int a:arr){
            perc += a;
        }
        perc = (perc * 100)/700;
        return perc;
    }
}
