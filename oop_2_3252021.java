class student {
    int id;
    String name;

    void getDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
}

public class oop_2_3252021 {
    public static void main(String[] args) {
        int id[] = {101, 102, 103, 104, 105};
        String name[] = {"Parth", "Jaimin", "Sanat", "Manan", "Lokesh"};
        char obj[] = {'a', 'b', 'c', 'd', 'e'};

        //create object for 5 students


        for (int j = 0; j < id.length; j++) {
            if (j == 0) {
                employee a = new employee();
                a.id = id[j];
                System.out.println("Id: " + a.id);
            } else if (j == 1) {
                employee b = new employee();
                b.id = id[j];
                System.out.println("Id: " + b.id);
            } else if (j == 2) {
                employee c = new employee();
                c.id = id[j];
                System.out.println("Id: " + c.id);
            } else if (j == 3) {
                employee d = new employee();
                d.id = id[j];
                System.out.println("Id: " + d.id);
            } else if (j == 4) {
                employee e = new employee();
                e.id = id[j];
                System.out.println("Id: " + e.id);
            }
        }


        for (int j = 0; j < name.length; j++) {
            if (j == 0) {
                employee a = new employee();
                a.name = name[j];
                System.out.println("Name: " + a.name);
            } else if (j == 1) {
                employee b = new employee();
                b.name = name[j];
                System.out.println("Name: " + b.name);
            } else if (j == 2) {
                employee c = new employee();
                c.name = name[j];
                System.out.println("Name: " + c.name);
            } else if (j == 3) {
                employee d = new employee();
                d.name = name[j];
                System.out.println("Name: " + d.name);
            } else if (j == 4) {
                employee e = new employee();
                e.name = name[j];
                System.out.println("Name: " + e.name);
            }
        }


    }
}
