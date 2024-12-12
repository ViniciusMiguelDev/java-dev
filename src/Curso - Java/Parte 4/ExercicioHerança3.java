public class ExercicioHerança3 {
    public static void main(String[] args) {
        Account x = new Account(1001, "Alex", 1000.0);
        Account y = new SavingsAccount(1001, "Alex", 1000.0, 0.1);

        x.withDraw(50);
        y.withDraw(50);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
