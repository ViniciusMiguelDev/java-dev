import java.util.Set;
import java.util.TreeSet;


public class hashSet4 {
    public static void main(String[] args) {
        Set<hashSet3_entity> set = new TreeSet<>();

        set.add(new hashSet3_entity("TV", 900.0));
        set.add(new hashSet3_entity("Notebook", 1200.0));
        set.add(new hashSet3_entity("Tablet", 400.0));

        for (hashSet3_entity h : set) {
            System.out.println(h);
        }
    }
}
