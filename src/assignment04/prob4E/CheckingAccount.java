package assignment04.prob4E;

public class CheckingAccount extends Account {

    double balance;
    double monthlyFee;
    String acctId;

    public CheckingAccount(String acctId, double balance, double monthlyFee) {
        this.acctId = acctId;
        this.balance = balance;
        this.monthlyFee = monthlyFee;
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
        return balance-monthlyFee;
    }
}
