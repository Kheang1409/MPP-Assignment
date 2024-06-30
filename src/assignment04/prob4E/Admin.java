package assignment04.prob4E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double total = 0.00;
		for(Employee e: list){
			total+=e.computeUpdatedBalanceSum();
		}
		return total;
	}
}
