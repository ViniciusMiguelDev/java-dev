import java.util.HashSet;
import java.util.Set;


public class hashSet3 {
    public static void main(String[] args) {
        Set<hashSet3_entity> set = new HashSet<>();

        set.add(new hashSet3_entity("TV", 900.0));
        set.add(new hashSet3_entity("Notebook", 1200.0));
        set.add(new hashSet3_entity("Tablet", 400.0));

        hashSet3_entity prod = new hashSet3_entity("Notebook", 1200.0);

        System.out.println(set.contains(prod));
    }
}
