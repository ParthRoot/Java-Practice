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

            // Multidimesional Array
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 101;
        arr1[0][1] = 102;
        arr1[0][2] = 103;
        arr1[1][0] = 201;
        arr1[1][1] = 202;
        arr1[1][2] = 203;

        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }


    }
}
