import java.util.TreeMap;
import java.util.Map;

public class exercicioMap {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "Maria@");
        cookies.put("phone", "123456789");

        cookies.remove("email");

        cookies.put("phone", "987654321");

        System.out.println("All cookies: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }   
}
