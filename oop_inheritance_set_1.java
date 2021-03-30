class sun{
    void hand(){
        System.out.println("It has two hand");
    }
    void legs(){
        System.out.println("It has two legs");
    }
    void hair(){
        System.out.println("it has black hair");
    }
}

class parents extends sun{
    void responsibility(){
        System.out.println("It has more responsibility");
    }
}
public class oop_inheritance_set_1 {
    public static void main(String[] args) {
        // get super class method
        System.out.println("get parents class method");
        sun obj = new sun();
        obj.hand();
        obj.legs();
        obj.hair();

        // get sub class and super class method using sub class
        parents obj1 = new parents();
        obj1.responsibility();
        obj1.hair();
        obj1.hand();
        obj1.legs();
    }
}
