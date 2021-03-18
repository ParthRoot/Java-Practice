import java.util.Scanner;
public class java_180321 {
    public static void main(String[] args){
        System.out.println("Hello Wolrd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Array
        /*

        arr[0] = 25;
        arr[1] = 30;
        arr[2] = 28;
        arr[3] = 85;
        arr[4] = 92;
        System.out.println(arr[2]);



        System.out.println("Enter the array element here");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for (int j=0;j<n;j++){
            System.out.println(arr[j]);
        }

        // three way to declare and memory allocation of array
        int[] x = new int[25]; //declaration and memory allocation

        int[] x1; //declaration
        x1 = new int[25]; //memory allocation
*/

        // for each loop
        int[] x2 = {25,85,95,45,25}; //declaration and intialize
        for(int element: x2){
            System.out.println(element);
        }



    }
}
