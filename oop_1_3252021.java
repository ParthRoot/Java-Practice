class employee{
    int id;
    String name;
    int sal;
    void getDetails(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee Name: "+name);
    }
    int getSallary(){
        return sal;
    }
}
public class oop_1_3252021 {
    public static void main(String[] args) {
        employee a = new employee();  //create object a for employee class
        a.id = 1001;
        a.name = "Parth";
        a.getDetails();

        employee b = new employee(); // create object b for employee class
        b.id = 1002;
        b.name = "Jaimin";
        b.getDetails();

        a.sal = 50000;
        System.out.println(a.name+"-"+a.getSallary());

        b.sal = 54524;
        System.out.println(b.name+"-"+b.getSallary());
    }
}
