class a1{
    public void s(){
        System.out.println("this is a1 class method");
    }
}

class a2 extends a1{
    @Override
    public void s(){
        System.out.println("this is a1 class method override by a2");
    }
}

@FunctionalInterface
interface myfuncinterface{
    void hello();
    /*public void hello1();*/
}
public class java_annotations {
    //deprecated
    @Deprecated
    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        //SuppressWarnings

        @SuppressWarnings("deprecation")

        //override
        a2 a = new a2();
        a.s();
    //deprecated
        sum(25,85);

    }
}
