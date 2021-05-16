import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {25,85,65};
        boolean flag = true;

        while (flag){
            System.out.println("Enter the index here: ");
            int n = sc.nextInt();

            try{
                try{
                    System.out.println(a[n]);
                    flag = false;
                }

                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                    System.out.println("Inner leval exception");
                }
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("Handle outer level exception");
            }

        }

        System.out.println("end of programmes");
    }
}
