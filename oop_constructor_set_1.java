class mainStudent{
    int id;
    String name;

    public mainStudent(int i, String s){
        id = i;
        name = s;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}
public class oop_constructor_set_1 {
    public static void main(String[] args) {
        mainStudent s1 = new mainStudent(25,"Parth");
        System.out.println(s1.getId()+" "+s1.getName());

    }
}
