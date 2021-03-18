import java.util.Scanner;
public class java_180321 {
    public static void main(String[] args){
        System.out.println("Hello Wolrd");
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Array


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


        //method Static
        int x = 10;
        int y = 20;
        int z = sum(x,y);
        System.out.println(z);

        java_180321 obj = new java_180321(); // create object for calling method
        int w = obj.mul(x, y);
        System.out.println(w);


        java_180321 obj1 = new java_180321();
        obj1.foo();
        obj1.foo(25);
        obj1.foo(5285,745);
*/

        java_180321 obj2 = new java_180321();
        System.out.println(obj2.hello(2,5,4));

        // recursion
        int n=4;
        System.out.println(factorial(n));
        System.out.println(factorial_intecrative(n));



    }
    // using static we not create object for calling method in main function
    static int sum(int a, int b){
        int c;
        c = a + b;
        return c;
    }

    //without static method we use the object to calling method in main function
    int mul(int a, int b){
        int c;
        c = a * b;
        return c;
    }

    // method overloading
    void foo(){
        System.out.println("This is:");
    }

    void foo(int a){
        System.out.println("This is :"+a);
    }

    int foo(int a, int b){
        System.out.println("This is :"+a);
        System.out.println("This is:" +b);
        return 34;
    }

    // varargs
    int hello(int ...arr){
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result = result + arr[i];
        }

        return result;
    }

    //recursion
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            int factorial = n * factorial(n-1);
            return factorial;
        }
    }

    // iteractive factorial
    static int factorial_intecrative(int n){

        if (n == 0 || n == 1){
            return 1;
        }
        else{
            int factorial1 = 1;
            for(int i=1;i<=n;i++){

                factorial1 *= i;

            }
            return factorial1;

        }
    }

}
