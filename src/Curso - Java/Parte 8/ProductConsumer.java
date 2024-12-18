import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProductConsumer {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.forEach(new ProductConsumerUpdate());
        //list.forEach(Product::staticPriceUpdate);
        //list.forEach(Product::nonStaticProductPredicate);
        //list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        Consumer<Product> pConsumer = p -> p.setPrice(p.getPrice() * 1.1);
        list.forEach(pConsumer);

        list.forEach(System.out ::println);
    }
}
