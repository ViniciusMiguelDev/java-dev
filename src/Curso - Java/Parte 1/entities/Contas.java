package entities;

public class Contas {
    private String name;
    private double balance = 0;
    private int accountNumber;

    public Contas(int accountNumber, String name) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public boolean initialValidation(char initialValidation) {
        if (initialValidation == 'y') {
            System.out.println("Enter initial deposit value:");
            return true;
        } else {
            return false;
        }
       
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setDeposity(double deposity) {
        this.balance += deposity;
    }

    public void setWithdraw(double withdraw) {
        this.balance = balance - (withdraw + 5);
    }

    public String getAccountData() {
        return "Updated account data:" + "\n" + "Account: " + accountNumber + " Holder: " + name + " Balance: "
                + balance;
    }

}
