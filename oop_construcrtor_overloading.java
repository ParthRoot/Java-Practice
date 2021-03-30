class mainStudent{
    int id;
    String name;

    public mainStudent(int i, String s){
        id = i;
        name = s;
    }

    public mainStudent(int id){
        this.id = id;
    }

    public mainStudent(String name){
        this.name = name;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}
public class oop_construcrtor_overloading {
    public static void main(String[] args) {
        mainStudent s1 = new mainStudent(25,"Parth");
        mainStudent s2 = new mainStudent(25);
        mainStudent s3 = new mainStudent("Parth");
        System.out.println(s1.getId()+" "+s1.getName());
        System.out.println(s2.getId());
        System.out.println(s3.getName());

    }
}
