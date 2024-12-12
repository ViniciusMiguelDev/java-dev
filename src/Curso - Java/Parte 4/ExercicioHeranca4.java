import java.util.ArrayList;
import java.util.List;

public class ExercicioHeranca4 {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

        double sum = 0;

        for (Account account : list) {
            sum += account.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account account : list) {
            account.deposit(10.0);
        }

        for (Account account : list) {
            System.out.println(account.getNumber() + " Total balance: " + account.getBalance());
        }
        
    }
}
