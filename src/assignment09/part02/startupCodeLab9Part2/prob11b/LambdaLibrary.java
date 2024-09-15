package assignment09.part02.startupCodeLab9Part2.prob11b;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> EMPLOYEE_FILTER =
            (list, salaryThreshold, startLetter) -> list.stream()
                    .filter(e -> e.getSalary() > salaryThreshold)
                    .filter(e -> e.getLastName().charAt(0) >= startLetter)
                    .map(Employee::fullName)
                    .sorted()
                    .collect(Collectors.joining(", "));
}
