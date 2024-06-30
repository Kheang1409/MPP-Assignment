package assignment04.prob4E;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String acctId;

    public SavingsAccount(String acctId, double balance, double interestRate) {
        this.acctId = acctId;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountID() {
        return "";
    }

    @Override
    public String getBalance() {
        return "";
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + (interestRate*balance);
    }
}
