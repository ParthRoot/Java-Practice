import java.util.Scanner;

class nonNegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radisu is not negative";
    }
}

public class throw_throws_exception{
    static public double area(int r) throws nonNegativeRadiusException {  //throws used to declare the exception
        if(r < 0){                                                          //thorw used to throw the excepton
            throw new nonNegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius here: ");
        int r = 0;
        r = sc.nextInt();
        try{
            double d = area(r);
            System.out.println(d);
        }
        catch (nonNegativeRadiusException e){
            System.out.println(e);
        }

    }
}
