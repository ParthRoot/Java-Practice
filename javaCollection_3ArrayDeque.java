import java.util.ArrayDeque;

public class javaCollection_3ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque l1 = new ArrayDeque(100);
        ArrayDeque l2 = new ArrayDeque(100);
        l1.add(25);
        l1.add(65);
        l1.add(21);
        l1.add(63);
        l1.add(10);
        l1.add(52);
        l1.add(30);

        l2.add(2556);
        l1.addAll(l2);

        l1.addFirst(25648);
        l2.addLast(25216);

        l1.offerFirst("Hello");
        l1.offerLast(25);
        l1.pollFirst();
      System.out.println(l1.getFirst());
      System.out.println(l1.getLast());
        System.out.println(l1.peekFirst());




    }
}
