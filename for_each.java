public class for_each {
    public static void main(String[] args) {
        String[] name = {"parth", "Jaimin", "Riya", "Manan", "Henil", "Janvee"};
        int i;
    /*
        System.out.println("print using for loop");
        for(i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }
        System.out.println("print using for each loop");

        System.out.println("print using while loop");
        int k = 0;
        while(k <= name.length)
        {
            System.out.println(name[k]);
            k++;
        }

     */
        for(String j: name){
            System.out.println(j);
        }
        int c = 0;
        System.out.println("print using do while loop");
        do{
            System.out.println(name[c]);
            c++;
        }while(c <= name.length);

    }
}

