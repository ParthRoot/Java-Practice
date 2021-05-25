import java.util.HashSet;

public class javaCollectionHashSet {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet(5,12.5f);
        h1.add(25);
        h1.add(28);
        h1.add(24);
        h1.add(26);
        h1.add(21);
        System.out.println(h1);
    }
}
