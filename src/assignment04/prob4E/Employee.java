package assignment04.prob4E;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts = new ArrayList<>();

	public Employee(String name) {
		this.name = name;
	}
	public Employee(String name, List<Account> accounts) {
		this.name = name;
		this.accounts = accounts;
	}
	public void addAccount(Account account) {
		accounts.add(account);
	}
	public double computeUpdatedBalanceSum() {
		double total = 0.00;
		for (Account account : accounts) {
			total += account.computeUpdatedBalance();
		}
		return total;
	}
}
