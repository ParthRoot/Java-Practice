
import java.util.Scanner;

//class employee_1 {
//    int id;
//    int salary;
//    String name;
//
//    void setDetails() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Emp_Id: ");
//        id = sc.nextInt();
//        System.out.println("Enter the Emp_Name");
//        name = sc.next();
//        System.out.println("Enter the Emp_Salary");
//        salary = sc.nextInt();
//    }
//
//    void getDetails() {
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(salary);
//    }
//
//
//}

//class student_1{
//    private int id;
//    int age;
//
//    void setId(int id){
//        this.id = id;
//    }
//
//    int getId(){
//        return id;
//    }
//}

class ex_Constructor_2{
    ex_Constructor_2(){
        System.out.println("Hello Constructor");
    }

    ex_Constructor_2(int a){
        System.out.println("Hello Constructor "+a);
    }
}

public class revesion {
//    static int hello(int a, int b){
//        a = 75;
//        return a;
//
//    }
//
//    static int hello(int b){
//        b = 85;
//        return b;
//    }
//
//    static void change(int arr[]){
//        arr[2] = 100;
//    }

    //varargs
//    static int VarArgs_sum(int ...arr){
//        int result = 0;
//        for(int i: arr){
//            result += i;
//
//        }
//
//        return result;
//
//    }

    //recursion
//    static int factorial(int n){
//        if(n == 1 || n == 0){
//            return 1;
//        }
//        else {
//            return n * factorial(n-1);
//        }
//    }




    public static void main(String[] args) {
//        int a = 50;
//        int b = 20;
//
//        System.out.println(hello(a,b)); // value changing by method
//        System.out.println(a); // print original value
//
//        System.out.println(hello(b)); // value changing by method
//        System.out.println(b); // print original value
//
//        int arr[] = {10,85,65,12};
//        change(arr);  // here method change the value of array element because in function we passed reference of array in argument
//        System.out.println(arr[2]);
//

        //varargs
//        System.out.println("Sum of two argument: "+VarArgs_sum(25,85));
//        System.out.println("Sum of three argument: "+VarArgs_sum(25,85,100));
//        System.out.println("Sum of four argument: "+VarArgs_sum(25,85,100,100));

//        System.out.println(factorial(5));

//        final int x = 500;
//        int y = 855;
//        y = 45;
//        System.out.println(y);

        // creating object of employee_1 class
//        employee_1 parth = new employee_1();
//        parth.setDetails();
//        parth.getDetails();
//
//        employee_1 jaimin = new employee_1();
//        jaimin.setDetails();
//        jaimin.getDetails();
//
//        student_1 a = new student_1();
//        int b = 850;
//        a.setId(b);
//        System.out.println(a.getId());

        ex_Constructor_2 x = new ex_Constructor_2(25);
        ex_Constructor_2 x1 = new ex_Constructor_2();




    }
}
