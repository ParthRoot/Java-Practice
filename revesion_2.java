package Practice;

//class parent{
//    int a;
//
//    parent(){
//        System.out.println("I am a parent class constructor");
//    }
//
//    parent(int c) {
//        System.out.println("I am parent class constructor with one argument: "+c);
//    }
//
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//      this.a = a;
//    }
//}
//
//class child extends parent{
//    int b;
//
//    child(){
//        System.out.println("I am child class constructor");
//    }
//
//    child(int c){
//        super(85);
//        System.out.println("I am parent class constructor with one argument: "+c);
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
//}


//method overriding
//class a{
//    void hello(){
//        int d = 25;
//        System.out.println(d);
//    }
//}
//
//class b extends a{
//    @Override
//    void hello(){
//        int a=10;
//        int b=20;
//        System.out.println("Sum: "+ (a+b));
//    }
//}
//


//Dynamic method dispatch
//class phone{
//    void showTime(){
//        System.out.println("Showing time is phone");
//    }
//
//    void greet(){
//        System.out.println("Hello World");
//    }
//
//    void pickup(){
//        System.out.println("Pickup Phone");
//    }
//
//
//}
//
//class smartPhone extends phone{
//    @Override
//    void showTime(){
//        System.out.println("Showing time is smartphone");
//    }
//
//    void music(){
//        System.out.println("Play Music......");
//    }
//
//    @Override
//    void pickup(){
//        System.out.println("Pickup smartPhone");
//
//    }
//
//}

////abstract class
//abstract class base{
//    public void greet(){
//        System.out.println("Hello World");
//    }
//
//    abstract  void printName();
//    abstract  void printId();
//}
//
//class derived extends base{
//
//    @Override
//     void printName(){
//        System.out.println("I am abstract class method created by Parth Patel");
//    }
//
//    @Override
//     void printId() {
//        System.out.println("I am abstract class method created by roll no 25 ");
//    }
//}

// interface
//interface Bicycle {
//    int x = 85;
//    void applyBreak();
//    void speedUp();
//}
//
//interface blowHorn{
//    void blow();
//
//    default void hello(){
//        System.out.println("Hello");
//    }
//}
//class AvonCycle implements Bicycle, blowHorn{
//    public void applyBreak(){
//        System.out.println("Applying break............................");
//    }
//
//    public void speedUp(){
//        System.out.println("increase the speed........................");
//    }
//
//    public void blow(){
//        System.out.println("Pee pee poo poo.........pee");
//    }
//}

// inheritance in interface
//interface myParent{
//    void math1();
//    void math2();
//}
//
//interface myChild extends myParent{
//    void math3();
//    void math4();
//}
//
//class combine implements myChild{
//    public void math1(){
//        System.out.println("Math1");
//    }
//    public void math2(){
//        System.out.println("Math2");
//    }
//    public void math3(){
//        System.out.println("Math3");
//    }
//    public void math4(){
//        System.out.println("Math4");
//    }
//}


// polymorphism
class cellPhone{
    void ringing(){
        System.out.println("tun, tun, tan, tan,.............");
    }

    void pickUpcall(){
        System.out.println("Push Green Button Pickup Call");
    }

    void endCall(){
        System.out.println("Push red button end call");
    }
}

interface camera{
    void takepic();
    void shotVideo();
}

interface gps{
    void searchLocation();
}

interface mediaPlayer{
    void playMusic();
    void playPlaylist();
}

class smartPhone extends cellPhone implements camera, gps, mediaPlayer{

    @Override
    public  void takepic(){
        System.out.println("Take Picture");
    }

    @Override
    public void shotVideo(){
        System.out.println("Shot Video");
    }

    @Override
    public void searchLocation() {
        System.out.println("Searching location");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music....");
    }

    @Override
    public void playPlaylist() {
        System.out.println("Playing Playlist.....");
    }
}

public class revesion_2 {
    public static void main(String[] args) {
        // after the  constructor

        //object of parent class
//        parent p = new parent();
//        p.setA(25);
//        System.out.println(p.getA());
//
//
//        child b = new child();
//        b.setA(25);
//        b.setB(85);
//        System.out.println("Parent class A: "+b.getA());
//        System.out.println("child class B: "+b.getB());
//
//
//         //inheritance with constructor
//        //child b = new child(25);

//        b obj1 = new b();
//        obj1.hello();

        //Dynamic method dispatch
//        phone obj = new smartPhone();
//        obj.greet();
//        obj.showTime();
//        obj.pickup();

       // base b = new base(); error because we not create object of abstract class

//        derived de = new derived();
//        de.printId();
//        de.printName();
//        de.greet();
//
//        AvonCycle a1 = new AvonCycle();
//        a1.applyBreak();
//        a1.blow();
//        a1.hello();
//        a1.speedUp();
//
//        System.out.println(a1.x);
//        //a1.x = 25; -- error
//        Bicycle a2 = new AvonCycle();
     //   Bicycle a2 = new Bicycle(); -- error



//        combine c1 = new combine();
//        c1.math1();
//        c1.math2();
//        c1.math3();
//        c1.math4();


        // polymorphism
        //user smartPhone as smartPhone


        smartPhone v1 = new smartPhone();
        v1.playMusic();
        v1.playPlaylist();
        v1.searchLocation();
        v1.shotVideo();
        v1.takepic();
        v1.endCall();
        v1.pickUpcall();
        v1.ringing();

        //use smartPhone as camera
        camera v2 = new smartPhone();
        v2.shotVideo();
        v2.takepic();

        //user smartPhone as gps
        gps v3 = new smartPhone();
        v3.searchLocation();

        //user smartPhone as mediaplayer
        mediaPlayer v4 = new smartPhone();
        v4.playMusic();
        v4.playPlaylist();



    }
}
