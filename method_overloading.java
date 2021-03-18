public class method_overloading {
    static int change(int a){
        a = 98;
        return a;
    }
    static void change1(int [] arr){
        arr[0] = 98;
    }
    // method overloading
    void foo(){
        System.out.println("Hello free method");
    }

    void foo(int a){
        System.out.println("Hello"+a+"method");
    }

    void foo(int c, int b){
        System.out.println("Hello"+c+","+b+"method");
    }
    // variable argument : ---- varargs
    int sum(int...arr){    // int... arr - behaviour like int [] arr
        int sum1 = 0;
        for(int a: arr){
            sum1 += a;
        }
        return sum1;
    }

    int mul(int...arr){
        int mul = 1;
        for(int a: arr){
            mul *= a;
        }
        return mul;
    }
    public static void main(String[] args){
        /*
        // case 1 changing the integer
        int x = 45;
        int v = change(x);
        System.out.println(x);
        System.out.println(v);

        // case 2 changing the array elements
        int [] marks = {80,75,79,95,100};
        System.out.println("before change");
        System.out.println(marks[0]);
        change1(marks);
        System.out.println("after change");
        System.out.println(marks[0]);
    */

        method_overloading obj = new method_overloading();
        obj.foo();
        obj.foo(3);
        obj.foo(4,5);

        // variable argument : ---- varargs
        System.out.println(obj.sum(25,85,45));
        System.out.println(obj.mul(25,85,45));
        System.out.println(obj.sum(25,85,95,45,75,25,65,45,12,11));



    }
}
