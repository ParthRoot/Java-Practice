class A{
    public void met1(){
        System.out.println("this is met1 for class A");
    }
}

class B extends A{
    @Override
    public void met1(){
        System.out.println("this is met1 for class B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
       // A a = new A();
       // a.met1();

        B b = new B();
        b.met1();

    }
}
