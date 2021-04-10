class hello{
    int x;
    hello(int x){
        this.x = x;
    }
    hello(){
        System.out.println("Without any argument hello class");
    }

    public int getX() {
        return x;
    }
}

class world extends hello{
    world(){
        super(25);
        System.out.println("World class constructor");
    }
}
public class this_super {
    public static void main(String[] args) {

        world obj = new world();
        System.out.println(obj.getX());

    }
}
