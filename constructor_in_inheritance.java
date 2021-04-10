class base{
    base(){
        System.out.println("Base Class Constructor Without argument");
    }

    base(int x){
        System.out.println("Base Class Constructor With argument "+x);
    }
}

class derived extends base{
    derived(int y){
        super(25);
        System.out.println("Derived Class Constructor without argument "+y);
    }

    derived(){
        System.out.println("Derived Class Constructor without argument ");
    }
}
public class constructor_in_inheritance {
    public static void main(String[] args) {
        derived obj = new derived(85); //both with argument
        derived obj1 = new derived(); // both without argument

    }
}
