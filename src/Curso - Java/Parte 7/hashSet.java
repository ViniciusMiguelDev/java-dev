import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        
        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }
    }
}
