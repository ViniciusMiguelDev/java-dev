import java.util.Scanner;

import entities.Contas;

public class ExercicioBanco {
    public static void main(String[] args) {
        // Scanner
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter account number:");
    int accountNumber = sc.nextInt();
    System.out.println();

    System.out.println("Enter account holder: ");
    String accountName = sc.nextLine();
    do {
        accountName = sc.nextLine();
    } while (String.valueOf(accountName) == null);
    System.out.println();

    System.out.println("Is there na initial deposit (y/n)?");
    char validation = sc.nextLine().charAt(0);
    System.out.println();

    double initialDeposity;
    Contas conta = new Contas(accountNumber, accountName);
    if(conta.initialValidation(validation) == true) {
        initialDeposity = sc.nextDouble();
        conta.setDeposity(initialDeposity);
    } else {
        initialDeposity = 0;
    }

    System.out.println("Account data:" + "\n" + "Account: " + conta.getAccountNumber() + " Holder: " + conta.getName() + " Balance: " + conta.getBalance());

    System.out.println();
    System.out.println("Enter a deposit value:");
    conta.setDeposity(sc.nextDouble());
    System.out.println(conta.getAccountData());

    System.out.println();
    System.out.println("Enter a withdraw value:");
    conta.setWithdraw(sc.nextDouble());
    System.out.println(conta.getAccountData());
      
    
    sc.close();
    }
}
