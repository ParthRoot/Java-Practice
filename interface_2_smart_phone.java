
interface camera{
    void takeSnap();
    void recordVideo();

    private void sayHello(){
        System.out.println("Say Hello");
    }
    default void greet(){
        sayHello();
        System.out.println("Good Moring");
    }
}

interface wifi {
    String [] getNetwork();
    void connectToNetwrok(String Network);
}

class MycellPhone{
    void callNumber(long phoneNumber){
        System.out.println("calling "+ phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class smartPhone1 extends MycellPhone implements camera, wifi{
    public void takeSnap(){
        System.out.println("Takking Snap");
    }

    public void recordVideo(){
        System.out.println("Recording Video");
    }

    public String [] getNetwork(){
        System.out.println("Getting List of Netwrok");
        String[] networkList = {"hello","world","Number"};
        return networkList;
    }

    public void connectToNetwrok(String Nerwork) {
        System.out.println("Connecting to: " +Nerwork);
    }
}
public class interface_2_smart_phone {
    public static void main(String[] args) {
        smartPhone1 obj = new smartPhone1();
        String[] arr = obj.getNetwork();
        for(String item: arr){
            System.out.println(item);
        }

        obj.callNumber(963861317);
        obj.pickCall();
        obj.takeSnap();
        obj.recordVideo();
        obj.greet();
        //obj.sayHello() /// error



    }
}
