class teacher{
    private int id;
    private String name;

    void setName_and_Id(int i, String s){
        id = i;
        name = s;
    }

    String getName(){
        return name;
    }

    int getId(){
        return id;
    }
}
public class oop_privat_accessmodifiers_1 {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.setName_and_Id(25, "Parth");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
    }
}
