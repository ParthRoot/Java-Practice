public class arrat_01 {
    public static void main(String[] args) {
        /*
            method 1:
            int [] marks = new int[10]; step 1 : declaration and memory allocation
            Method 2:
            int [] marks; declaration
            marks = new int[20]; memory allocation
            Method 3:
            int [] marks = {1,2,3,4,5}; declaration and intialization
         */

        System.out.println("Decalaration and memory allocation in single line");
        int[] marks = new int[10];
        marks[0] = 10;
        marks[1] = 11;
        marks[2] = 12;
        marks[3] = 13;
        marks[4] = 14;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        System.out.println("Declaration and memory allocation in multiple line");
        String[] name = new String[5];
        name[0] = "Parth";
        name[1] = "Jaimin";
        name[2] = "Janvee";
        name[3] = "Ankur";
        name[4] = "Henil";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);

        System.out.println("Declaration with intialization");
        Float [] point = {10.5f, 11.55f, 12.85f, 1.00f};
        System.out.println(point[0]);
        System.out.println(point[1]);
        System.out.println(point[2]);
        System.out.println(point[3]);

        System.out.println("Find the length of marks");
        System.out.println(marks.length);




    }
}
