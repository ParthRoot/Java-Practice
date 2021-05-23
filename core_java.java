import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;  // import scanner class

import java.lang.String;


// importing custom packages
import coreParthJava.hello.helloWorld;
import coreParthJava.parth;




public class core_java {
    // method
//    void sayHello(){
//        System.out.println("Hello World");
//    }
//
//    public int returnInt(){
//        int i = 25;
//        return i;
//    }
//
//    // use static keyword you can not create object of any class for calling method
//    public static void sayHelloStatic(){
//        System.out.println("SayHelloStatic");
//    }
//
//    public static int add(int a, int b){
//        return a+b;
//    }

    //method overloading
    //different parameter but not different return type
//    public static int mul(int a, int b){
//        return a*b;
//    }
//
//    public static int mul(int a, int b, int c){
//        return a*b*c;
//    }

//    public static  void changeValue(int x){
//        x = 25;
//    }

//    public static void changeValueArray(int arr[], int i){
//        arr[i] = 25;
//    }

    //variable argument
/*

    public static int addtion(int...arr){
        int result = 0;
        for(int i: arr){
            result += i;
        }
        return result;
    }
*/

    // recursion :- function call itself
 /*   public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
*/
    public static void main(String[] args) {
        //1....Variable and datatype and literal
        //syntax  data type variable_name = value
//        int a = 25; // 25 is integer literal
//        float a1 = 85.6f; // this is float literal  similar to all
//        double a2 = 45.5;
//        char a3 = 'a';
//        byte a4 = 5;
//        short a5 = 52;
//        long a6 = 52461565;
//        boolean a7 = true;
//        String str = "HelloWorld";
//        System.out.println("int-" + a + "\nfloat-" + a1 + "\ndouble-" + a2 + "\nchar-" + a3 + "\nbyte-" + a4 + "\nshot-"
//        + a5 + "\nlong-" + a6 + "\nboolean-" + a7 + "\nString-" + str);

        //2.....UserInput in java
        //Scanner class is used to userinput
        Scanner sc = new Scanner(System.in); // object of scanner class
//        System.out.println("Enter the any string here- ");
//        String a8 = sc.nextLine();
//        System.out.println(a8);
//        System.out.println("Enter the any int here- ");
//        int a11 = sc.nextInt();
//        System.out.println(a11);
//        System.out.println("Float");
//        float a12 = sc.nextFloat();
//        System.out.println(a12);
//        System.out.println("double");
//        double a13 = sc.nextDouble();
//        System.out.println(a13);
//        System.out.println("String");
//        String a14 = sc.next();
//        System.out.println(a14);
//        System.out.println("CharAt- "+ a14.charAt(3));
//        System.out.println("Byte");
//        byte a15 = sc.nextByte();
//        System.out.println(a15);
//        System.out.println("Short");
//        short a16 = sc.nextShort();
//        System.out.println(a16);
//        System.out.println("Long");
//        long a17 = sc.nextLong();
//        System.out.println(a17);

        //3....Operator

        //Arithmetic operator
//        System.out.println("25+78: "+(25+78));
//        System.out.println("85-20: "+(85-20));
//        System.out.println("20*10: "+(20*10));
//        System.out.println("20/10: "+(20/10));
//        System.out.println("20%3: "+(20%3));
//        int a18 = 20;
//        a18++;
//        System.out.println("++: "+a18);
//        a18--;
//        System.out.println("--: "+a18);

        //Assignment Operator
//        int x = 5;
//        System.out.println(x);
//        x += 25;
//        System.out.println("x += 25: "+x);
//        x -= 20;
//        System.out.println("x -= 20: "+x);
//        x *= 5;
//        System.out.println("x *= 5: "+x);
//        x /= 10;
//        System.out.println("x /= 10: "+x);
//        x %= 5;
//        System.out.println("x %= 5: "+x);

        //comparison operator
//        System.out.println("Enter the value a here: ");
//        int a21 = sc.nextInt();
//        System.out.println("Enter the value b here: ");
//        int a22 = sc.nextInt();
//
//        if(a21 == a22){
//            System.out.println("value of a and b is equal");
//        }
//        else if (a21 > a22){
//            System.out.println("a21 is greater then b");
//        }
//        else if (a21 < a22){
//            System.out.println("a22 is greater then a21");
//        }
//        else if (a21 <= a22){
//            System.out.println("a22 is greater then or equal a21");
//        }
//        else if (a21 >= a22){
//            System.out.println("a21 is greater then or equal a22");
//        }
//        else if (a21 != a22){
//            System.out.println("a21 and a22 is not equal");
//        }
//        else{
//            System.out.println("Kabhi kabhi jlsa be karo");
//        }

        // logical operator
        /*
        && -- logical and
        || -- logical or
        ! -- logical not
         */

        //Associative and precedence operator
        // a23 = a24 * a25 - a26 + a27 / a28;
//        int a24 = 10, a25 = 5, a26 = 30, a27 = 10, a28 = 2;
//        int a23 = a24 * a25 - a26 + a27 / a28;
//        int a30 = (a24 * a25) - (a26 + a27 / a28);
//        System.out.println(a23);
//        System.out.println(a30);

        //Resulting data type after arithmetic operation
        /*
        Result = byte + short -> integer
        Result = short + integer -> integer
        Result = long + float -> float
        Result = integer + float -> float
        Result = character + integer -> integer
        Result = character + short -> integer
        Result = long + double -> double
        Result = float + double -> double
         */
//        int a31 = 25;
        // check type of variable
//        System.out.println(((Object) a31).getClass().getSimpleName());
//        System.out.println(((Object) a31).getClass().getSimpleName());

        //Increment and Decrement operators
//        System.out.println("a31++: "+a31++);
//        System.out.println("a31: "+a31);
//        System.out.println("++a31: "+(++a31));
//        System.out.println("a31: "+a31);
//        System.out.println("a31--: "+a31--);
//        System.out.println("a31: "+a31);
//        System.out.println("--a31: "+(--a31));

        // introduction to string
        // String is class but used as data type and it is immutable it can not be change
//        String a41 = "Hello";
        //print statement in 3 ways
//        System.out.print(a41);  // no new line at end
//        System.out.println(a41); //new line at end
//        System.out.printf("%s", a41);
//        System.out.println("");
//
//        String a42 = new String("Hello World");
//        System.out.println(a42);

//        a41.concat("Patel"); //can not change value
//        a41 =  a41.concat("Patel"); // change the string

        // Decision-making instructions in Java
        //if-else statement
//        boolean b = false;
//        if(b){
//            System.out.println("Execute if statement");
//        }
//        else {
//            System.out.println("Execute else statement");
//        }

        //else if statement
//        int b1 = 3;
//        if(b1 == 1){
//            System.out.println("b1 = 1");
//        }
//        else if(b1 == 2){
//            System.out.println("b1 = 2");
//        }
//        else{
//            System.out.println("Better luck");
//        }

        //nested if...else
//        int b2 = 10;
//        int b3 = 7;
//        if (b2 > b3){
//            if(b3 <= 5){
//                System.out.println(b2/b3);
//            }
//            else{
//                System.out.println("Sorry");
//            }
//        }
//        else{
//            System.out.println("ending.....");
//        }

        // switch
//        System.out.println("Enter your choice: ");
//        String b4 = sc.next();
//        char a5 = b4.charAt(0);
//        switch (a5){
//            case '+':
//                System.out.println("a+b: "+(b2+b3));
//                break;
//            case '-':
//                System.out.println("a-b: "+(b2-b3));
//                break;
//            default:
//                System.out.println("Wrong Choice");
//        }


        //loop
        //while
//        System.out.println("Enter the element you execute statement in while_loop: ");
//        int b4 = sc.nextInt();
//        int b5 = 1;
//        while (b5 <= b4){
//            System.out.println(b5);
//            b5++;
//        }

        //for loop
//        for(int i=1;i<=b4;i++){
//            System.out.println(i);
//        }

//        //do while loop
//        do{
//            System.out.println(b5);
//              b5++;
//        }while (b5 <= b4);

        //break and continue statement
//        for(int i=1;i<=b4;i++){
//            if(i == 25){
//                break;
//            }
//            else if(i == 12){
//                 continue;
//            }
//            else {
//                System.out.println(i);
//            }
//        }


        //array
        //array declare after memory allocation
/*      int arr[];
        arr = new int[10];
*/
        //array declare withe allocate memory
//        int arr[] = new int[10];

        //array declare with initialize and memory allocation
//        int arr[] = {25,85,65,10};
        /*for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

        //for each loop
        /*for(int i: arr){
            System.out.println(i);
        }*/

        // user input in array
       /* System.out.println("Enter the size of array: ");
        int b10 = sc.nextInt();
        int arr[] = new int[b10];
        System.out.println("Enter the array elements");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/


        // multidimensional array
//        int arr1[][] = {{10,25},{1,2},{52,58}};
//        for (int i = 0;i<arr1.length;i++){
//            for(int j=0;j<arr1[i].length;j++){
//                System.out.println(arr1[i][j]);
//            }
//        }

        // method in java
//        core_java b10 = new core_java();
//        b10.sayHello();
//
//        System.out.println(b10.returnInt());
//
//        sayHelloStatic();
//
//        System.out.println(add(25,85));

//        System.out.println(mul(25,85,75));
//        System.out.println(mul(5,8));

    /*    int b11 = 85;
        System.out.println(b11);
        changeValue(b11);
        System.out.println(b11);

        //here not change value of b11 because b11's copy pass in the method and
        //copy can be change not actual value can be change
        */
/*
        int arr[]  = {25,85,45,36,56};
        int i = 2;
        System.out.println(arr[i]); //before change value
        changeValueArray(arr,i);
        System.out.println(arr[i]); //after changing value

        */

        //variable argument
//        System.out.println(addtion(25,85,65,12,120));
//        System.out.println(addtion(1,5,6,7,5));

        //recursion
//        int n = 5;
//        System.out.println("Factorial of "+n+" = "+factorial(n));

        /*
           object oriented programing concept

           class = blue print of creating an objects
           object = instantiation of class
           abstraction = hiding internal details
           encapsulation = putting various component together
           inheritance = create new things using existing thing
           polymorphism = one entity many forms
     */
/*
        employee_core parth = new employee_core();
        parth.id = 25;
        parth.name = "Parth Patel";
        parth.age = 20;

        System.out.println(parth.getId());
        System.out.println(parth.getAge());
        System.out.println(parth.getName());

        employee_core Jaimin = new employee_core();
        Jaimin.id = 28;
        Jaimin.name = "Jaimin Patel";
        Jaimin.age = 23;

        System.out.println(Jaimin.getId());
        System.out.println(Jaimin.getAge());
        System.out.println(Jaimin.getName());

        */

       /*
        test_core p2 = new test_core();
        p2.setA(25);
        p2.setB(56);
        System.out.println("a: "+p2.getA());
        System.out.println("b: "+p2.getB());
        */

        // constructor
//        emp_core p2 = new emp_core(25000);

        /*emp_core1 p3 = new emp_core1();
        emp_core1 p4 = new emp_core1(25);
        emp_core1 p5 = new emp_core1(1,5);*/

/*

        // inheritance
        super_1 p3 = new super_1();
        p3.say();
        p3.walk();


        sub_1 p4 = new sub_1();
        p4.walk();
        p4.say();
        p4.cry();
        p4.jump();
*/

/*
        //constructor in inheritance

        //with argument
        base_1 p5 = new base_1(250);

        //without argument
        base_1 p6 = new base_1();
*/

        //this keyword
     /*   this_core p5 = new this_core();
        p5.chage(25);*/

        //method overriding
    /*    parents_core p12 = new parents_core();
        child_core p13 = new child_core();

        p12.greet();
        p12.hello();
        p13.hello();
        p13.thanks();
    */

        //dynamic method dispatch

      /*  phone_core p14 = new smartPhone_core();
        p14.on();
        p14.phonering();
       // p14.playMusic(); --> error*/


     /*   childCore c1 = new childCore();
        c1.greet();
        c1.sayHello();
        c1.thanks();
*/

        // abstract class
        // parenetCore c2 = new parenetCore(); --> show error
        // we can  create a reference of abstract class but  we can not create a object of abstract class
     /*   parenetCore c2 = new childCore();
        c2.greet();
        c2.sayHello();
        c2.thanks();
*/

        //Interface
        // we can not create object of interface but we create a reference of interface
        //Bicycle c4 = new AvonCycle(); -- allow
        // Bicycle c4 = new Bicycle(); ---> error
/*

        AvonCycle c4 = new AvonCycle();
        c4.applyBreak(40);
        c4.sppedUp(100);
        c4.blowHorndSimple();
        c4.blowHornMusic();
        System.out.println(c4.x);
        // c4.x = 100; --> we can not change property of interface

*/
/*

        simpleClass c5 = new simpleClass();
        c5.method1();
        c5.method2();
        c5.method3();
        c5.method4();

*/

        //polymorphism
     /*   miY2 c5 = new miY2();
        c5.pickUpCall();
        c5.callNumber(96386131);
        c5.takesnap();
        c5.playGame();
        c5.Connect("Parth");
        c5.recordVideo();*/
/*

        wifi_1 c6 = new miY2();
        c6.Connect("Parth");

        playgame c7 = new miY2();
        c7.playGame();

        myCamera c8 =  new miY2();
        c8.greet();
        c8.recordVideo();
        c8.takesnap();
        c8.record4kVideo();

 */


        /*
        package in java
        create package



        parth p1 = new parth();
        p1.hello();

        helloWorld p2 = new helloWorld();
        p2.hellWorld_java();

         */

        // exception
        // try and catch

        //simple exception handle
       /* int a[] = {1,2,3};
        try {
            System.out.println(a[5]);
        }
        catch (Exception e){
            System.out.println(e);
        }*/

        //nested try catch
/*
        try{
            int a = 10;
            int b = 0;
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

*/

        // handle specific exception
/*
        int a1[] = {10,15,85};
        int i = 2;
        try {
            System.out.println(a1[5]/i);
        }
        catch (ArithmeticException e1){
            System.out.println(e1);
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
        }
*/
        // custom exception
/*
        int a = 0;
        if(a != 0){
            try {
                throw new myExceptionCore();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e.printStackTrace(););

            }


        }
        System.out.println("End of the programme");
*/
    /*    try {
            System.out.println(areaOfCircle(-25));
        }
        catch (Exception e){
            System.out.println(e);
        }

*/
       /* //Thread using extend method
        MyThread t1 = new MyThread();
        MyThread_1 t2 = new MyThread_1();
        MyThread_2 t3 = new MyThread_2();
        t1.start();
        t2.start();
        t3.start();
*/

     /*   thread_5 t5b = new thread_5();
        thread_4 t4b = new thread_4();
        thread_6 t6b = new thread_6();

        Thread t4 = new Thread(t4b);
        Thread t5 = new Thread(t5b);
        Thread t6 = new Thread(t6b);

        t4.start();
        t5.start();
        t6.start();*/

        consThread c1 = new consThread("Parth");
        consThread c2 = new consThread("Sanat");
        consThread c3 = new consThread("JAIMIN");
        c1.setPriority(Thread.MIN_PRIORITY);
        c2.setPriority(Thread.MAX_PRIORITY);
        c3.setPriority(Thread.NORM_PRIORITY);
        c1.start();
        c2.start();
        c3.start();


    }

/*
    // thorw and thows exception
    public static double areaOfCircle(int area) throws nonNegativeCoreException, notZeroException{
        if(area < 0){
            throw new nonNegativeCoreException();
        }
        else if(area == 0){
            throw new notZeroException();
        }
        double result = Math.PI * area * area;
        return result;
    }
*/


}

//object oriented concept
/*

class employee_core {
    int id;
    String name;
    int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
*/

// getter and setter
/*
class test_core{
    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
*/


// constructor in java

/*
class emp_core{
    public emp_core(long salary){
        System.out.println("Salary: "+salary);
    }
}
*/

// constructor overloading
/*
class emp_core1{
    public emp_core1(){
        System.out.println("Null constructor");
    }

    emp_core1(int a){
        System.out.println("constructor with one parameter");
    }

    emp_core1(int a, int b){
        System.out.println("constructor with two parameter");
    }
}

*/

// inheritance

/*
class super_1{
    public void say(){
        System.out.println("I am saying");
    }

    public void walk(){
        System.out.println("I am walking");
    }
}

class sub_1 extends super_1{
    public void cry(){
        System.out.println("I am crying");
    }

    public void jump(){
        System.out.println("I am jumping");
    }
}

*/

// constructor in inheritance
/*
class derived_1{
    derived_1(){
        System.out.println(" i am null constructor for derived class without any parameter");
    }

    derived_1(int a){
        System.out.println(" i am notnull constructor for derived class with parameter");
    }
}

class base_1 extends derived_1{
    base_1(){
        System.out.println(" i am null constructor for base class without any parameter");
    }

    base_1(int a){
        super(25);
        System.out.println(" i am notnull constructor for base class without any parameter");
    }

}

 */

//this key word
/*
class this_core{
    int x=0;
    public void chage(int x){
        this.x = x;
        System.out.println(this.x);
    }

}
*/

//method overriding
/*

class parents_core{
    void hello(){
        System.out.println("say Hello Parenet");
    }

    void greet(){
        System.out.println("Good morning");
    }
}

class child_core extends parents_core{

    @Override
    void hello(){
        System.out.println("Say Hello child class");
    }

    void thanks(){
        System.out.println("Thank You so much");
    }

}
*/

//dynamic method dispatch

/*
class phone_core{
    void on(){
        System.out.println("Phone on");
    }

    void phonering(){
        System.out.println("trin trin trin/.........");
    }
}
class smartPhone_core extends phone_core{
    void on(){
        System.out.println("Smart Phone on");
    }

    void smartPhoneRing(){
        System.out.println("Tuje dekhato di vana sanam.......");
    }

    void playMusic(){
        System.out.println("Play Music");
    }
}

*/


// abstract class
/*
abstract class parenetCore{
    abstract void sayHello();
    abstract void greet();
    void thanks(){
        System.out.println("Thank you so much");
    }

}

class childCore extends parenetCore{
    @Override
    void sayHello() {
        System.out.println("Hello World");
    }

    @Override
    void greet() {
        System.out.println("Good Morning");
    }
}
*/
/*
interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void sppedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornMusic();
    void blowHorndSimple();
}

class AvonCycle implements Bicycle, HornBicycle{

    @Override
    public void applyBreak(int decrement) {
        System.out.println("Decrease the speed: "+decrement);
    }

    @Override
    public void sppedUp(int increment) {
        System.out.println("Increase the speed: "+increment);
    }

    @Override
    public void blowHorndSimple() {
        System.out.println("PEE POO PEE POO........");

    }

    @Override
    public void blowHornMusic() {
        System.out.println("tuje dekha to divana sanam...........");
    }
}*/
/*

interface paranetIntereface{
    void method1();
    void method2();
}

interface childInterface extends paranetIntereface{
    void method3();
    void method4();
}

class simpleClass implements  childInterface{
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }
    @Override
    public void method4(){
         System.out.println("Method 4");
     }
}
*/
/*

class samsungGuru{
    void ring(){
        System.out.println("ringing....");
    }

    void callNumber(long number){
        System.out.println("calling: "+number);
    }

    void pickUpCall(){
        System.out.println("Connection..........");
    }

}

interface myCamera{
    void takesnap();
    void recordVideo();
    default void greet(){
        System.out.println("Hello");
    }

    default void record4kVideo(){
        System.out.println("Recording in 4k....");
    }


}

interface playgame{
    void playGame();
}

interface wifi_1{
    void Connect(String name);
}

class miY2 extends samsungGuru implements myCamera, playgame, wifi_1{
    @Override
    public void takesnap() {
        System.out.println("Taking snap..");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void playGame() {
        System.out.println("Playing Pubg");
    }

    @Override
    public void Connect(String name) {
        System.out.println("Connecting Netwrok: "+name);
    }

}
*/
/*
class myExceptionCore extends Exception{
    @Override
    public String toString() {
        return "String by parth exception";
    }

    @Override
    public String getMessage() {
        return "getMessage by parth exception";
    }
}
*/

/*

//throw and throws keyword
class nonNegativeCoreException extends  Exception{
    @Override
    public String toString() {
        return "Area is non negative";
    }
}

class notZeroException extends  Exception{
    @Override
    public String toString() {
        return "Area is not zero";
    }
}
*/
/*

//Thread using extend method
class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i <= 1000){
            System.out.println("Thread 1 execute.....1");
            i++;
        }
    }
}

class MyThread_1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i <= 1000){
            System.out.println("Thread 2 execute.....2");
            i++;
        }
    }
}

class MyThread_2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i <= 1000){
            System.out.println("Thread 3 execute.....3");
            i++;
        }
    }
}

*/

/*
// thread using runnable interface
class thread_4 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i <= 1000){
            System.out.println("Thread 4 execute.....4");
            i++;
        }
    }
}

class thread_5 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i <= 1000){
            System.out.println("Thread 5 execute.....5");
            i++;
        }
    }
}


class thread_6 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i <= 1000){
            System.out.println("Thread 6 execute.....6");
            i++;
        }
    }
}
   */     
        

class consThread extends Thread{
    public consThread(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 1;
        while (i <= 30){
            System.out.println(i+"-"+getName()+"-"+getId());
            i++;
        }
    }
}









