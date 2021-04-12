interface Bycycle{
    int a =45;
    void applybreak(int decrement);
    void speedUp(int increment);
}

interface horn{
    void blowSimple();
    void blowunique();

}
class avone implements Bycycle, horn{   
    avone(){
        System.out.println("This avone class constructor");
    }
   public void applybreak(int decrement){
       System.out.println("applying break");
    }
   public void speedUp(int increment){
       System.out.println("speed up");
    }

    public void blowSimple(){
        System.out.println("pee pee pee pee poo poo poo poo");
    }
    public void blowunique(){
        System.out.println("tuje dekha to diwana sanam poo poo poo poo");
    }
}
public class java_interface {
    public static void main(String[] args) {
        avone obj = new avone();
        obj.applybreak(25);
        obj.speedUp(85);
        obj.blowSimple();
        obj.blowunique();
      //  obj.a = 85 // error we not change interface property because it is final

    }
}
