import java.util.HashMap;
import java.util.Map;

public class exercicioMap2 {
    public static void main(String[] args) {
        Map<MapProduct, Double> stock = new HashMap<>();
        MapProduct p1 = new MapProduct("Tv", 900.0);
        MapProduct p2 = new MapProduct("Notebook", 1200.0);
        MapProduct p3 = new MapProduct("Tablet", 400.0);
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        MapProduct ps = new MapProduct("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
