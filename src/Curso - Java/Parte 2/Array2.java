import java.util.Locale;
import java.util.Scanner;

import entities_2.Product;

public class Array2 {
    public static void main(String[] args) {
        // Locale
        Locale.setDefault(Locale.US);

        // Scanner
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("A média dos produtos é = %.2f%n", avg);

        sc.close();
    }
}
