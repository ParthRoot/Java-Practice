class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Call Friend...");
    }
}
public class oop_practice_Set_2 {
    public static void main(String[] args) {
        cellPhone nokia = new cellPhone();
        nokia.ring();
        nokia.vibrate();
        nokia.callFriend();
    }
}
