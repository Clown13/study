package collections;
import java.util.ArrayList;

public class CollectionsExampleArrayList {
    //First start with basic arrayList. ArrayList is dynamic in size, allows duplicates, and maintains insertion order.
    //Key Methods: add(element), remove(index), get(index), size().

    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Sanha");
        names.add("Michael");
        names.add("George");
        names.add("Haesu");
        System.out.println(names);

        System.out.println(names.get(0));
        names.remove(1);
        System.out.println(names);
        System.out.println(names.size());
        names.add("Sanha");

        for (String name : names) {
            System.out.println(name);
        }

    }
}
