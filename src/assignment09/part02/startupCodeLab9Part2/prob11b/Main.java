package assignment09.part02.startupCodeLab9Part2.prob11b;

import assignment09.part02.startupCodeLab9Part2.prob11b.Employee;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));

		String result = LambdaLibrary.EMPLOYEE_FILTER.apply(list, 100000, 'N');
		System.out.println(result);
	}

}
