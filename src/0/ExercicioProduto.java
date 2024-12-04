import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ExercicioProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Scanner
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Insira o nome do produto:");
        product.name = sc.nextLine();

        System.out.println("Insira o preço do produto:");
        product.price = sc.nextDouble();

        System.out.println("Insira a quantidade do produto em estoque:");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Insira o numero de produtos para ser adicionado:");
        product.addProducts(sc.nextInt());
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Insira o numero de produtos para ser removido:");
        product.removeProducts(sc.nextInt());
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
