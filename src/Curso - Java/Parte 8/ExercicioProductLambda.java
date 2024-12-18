import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioProductLambda {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /*double[] sum = {0};
        list.forEach(p -> {
            if (p.getName().toUpperCase().charAt(0) == 'T') {
                sum[0] += p.getPrice();
            }
        });
        System.out.println(String.format("%.2f", sum[0]));*/

        ProductServiceEx ps = new ProductServiceEx();
        double sum = ps.filteredSum(list, p -> p.getName().toUpperCase().charAt(0) == 'T');
        System.out.println(sum);
    }
}
