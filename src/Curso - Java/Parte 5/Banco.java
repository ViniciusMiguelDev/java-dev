import java.util.Locale;
import java.util.Scanner;

import models.exceptions.BusinessException;

public class Banco {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // Locale
        Locale.setDefault(Locale.US);

        // Inputs
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        String holder = sc.next();

        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double limit = sc.nextDouble();

        // Create account
        AccountBanco accountBanco = new AccountBanco(number, holder, balance, limit);

        // Withdraw
        System.out.print("Enter amount for withdraw: ");
        double withdraw = sc.nextInt();
        try {
            accountBanco.withDraw(withdraw);
            System.out.printf("New balance: %.2f%n", accountBanco.getBalance());
        } catch (BusinessException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
