import java.util.LinkedList;

public class javaCollecition_1LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(25);
        l1.add(65);
        l1.add(21);
        l1.add(63);
        l1.add(10);
        l1.add(52);
        l1.add(30);

        l2.add(2556);
        l1.addAll(2,l2);

        l1.add(5,855);
        l1.add(2,856);

        l1.addFirst(25648);
        l2.addLast(25216);
        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i)+"\t");
        }
    }
}
