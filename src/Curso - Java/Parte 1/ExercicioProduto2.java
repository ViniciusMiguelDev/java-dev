
import java.util.Scanner;

import entities.Product2;

public class ExercicioProduto2 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do produto:");
        String name = sc.nextLine();

        System.out.println("Insira o preço do produto:");
        double price = sc.nextDouble();

        System.out.println("Insira a quantidade do produto em estoque:");
        int quantity = sc.nextInt();

        Product2 product = new Product2(name, price, quantity);

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

        System.out.println();

        product.setName("Abacate");
        System.out.println(product.getName());

        product.setPrice(20.00);
        System.out.println(product.getPrice());

        product.setQuantity(10);
        System.out.println(product.getQuantity());
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
