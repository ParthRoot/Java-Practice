class phone{
    public void ring(){
        System.out.println("Ringing............ class phone");
    }

    public void showtime(){
        System.out.println("Show Time for class Phone");
    }

    public void pickup(){
        System.out.println("Pickup phone");
    }
}

class smartPhone extends phone{
    public void ring1(){
        System.out.println("Ringing............ class smartphone");
    }

    public void showtime(){
        System.out.println("Show Time for class smart Phone");
    }

    public void on(){
        System.out.println("On smart phone");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new smartPhone();
        obj.pickup();
        obj.showtime();
    }
}
