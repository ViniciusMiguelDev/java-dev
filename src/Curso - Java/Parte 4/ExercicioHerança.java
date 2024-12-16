public class ExercicioHerança {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UpCasting
        Account acc1 = bacc;
        BusinessAccount acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        SavingsAccount acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DownCasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        // BusinessAccount acc5 = (BusinessAccount)acc3; *Erro*
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
          //  acc5.loan(200);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}