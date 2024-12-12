import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProducts {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Locale
        Locale.setDefault(Locale.US);

        List<Product> produtos = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (C/U/I)? ");
            char CUI = sc.next().toUpperCase().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (CUI == 'C') {
                Product prod = new Product(name, price);
                produtos.add(prod);
            } else if (CUI == 'U') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manuDate = sdf.parse(sc.next());
                Product prod = new UsedProduct(name, price, manuDate);
                produtos.add(prod);
            } else if (CUI == 'I') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                Product prod = new ImportedProduct(name, price, fee);
                produtos.add(prod);
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product product : produtos) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
