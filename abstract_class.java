abstract class a{
    public void os(){
        System.out.println("This is os class for a");
    }

    public void ms(){
        System.out.println("This is ms class for a");
    }

    abstract void wish();
}

class b extends a{
    @Override
    public void wish(){
        System.out.println("This abstract for b that override from a");
    }

    public void maths(){
        System.out.println("this is maths class for b");
    }
}

abstract class c extends a{
    void message(){
        System.out.println("This is abstract class that extends the abstract class a");
    }
}

public class abstract_class {
    public static void main(String[] args) {

        b obj = new b();
        obj.wish();

       // a obj1 = new obj1() ----- error
        // c obj2 = new obj2() ---- error
    }

}
