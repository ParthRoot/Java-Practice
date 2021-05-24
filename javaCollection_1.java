import java.util.ArrayList;

public class javaCollection_1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(85);
        l1.add(54);
        l1.add(25);
        l1.add(0,65);
        l1.add(2,56);

        l2.add(258);
        l2.add(300);
        l2.add(288);
        l2.add(128);
        l2.add(958);

        l1.addAll(0,l2);
        System.out.println(l1.contains(54));
        System.out.println(l1.indexOf(54));
        l1.set(2,65624654);
        //l1.clear();

        for(int i=0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
