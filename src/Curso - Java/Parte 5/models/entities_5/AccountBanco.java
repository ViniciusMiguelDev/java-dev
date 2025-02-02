import models.exceptions.BusinessException;

public class AccountBanco {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public AccountBanco() {
    }

    public AccountBanco(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double deposit) {
        this.balance += deposit;
    }

    public void withDraw(Double amount) {
        withdrawValidate(amount);
        this.balance -= amount;
    }

    public void withdrawValidate (double amount) {
        if (amount > getWithdrawLimit()) {
            throw new BusinessException("The amount exceeds withdraw limit!");
        }
        if (amount > getBalance()) {
            throw new BusinessException("Not enough balance!");
        }
    }

}