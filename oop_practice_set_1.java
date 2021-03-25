class employee1 {
    int id;
    String name;
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    void setName(){
        name = "Parth";
    }
}
public class oop_practice_set_1 {
    public static void main(String[] args) {
        employee1 a = new employee1();
        a.id = 101;
        a.name = "Henil";

        System.out.println(a.getId());
        System.out.println(a.getName());
        a.setName();
        System.out.println(a.getName());
    }
}
