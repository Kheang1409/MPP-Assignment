package assignment08.pack6;

/*
A. (Employee e) -> e.getName()
B. (Employee e,String s) -> e.setName(s)
C. (String s1,String s2) -> s1.compareTo(s2)
D. (Integer x,Integer y) -> Math.pow(x,y)
E. (Apple a) -> a.getWeight()
F. (String x) -> Integer.parseInt(x);
G. EmployeeNameComparator comp = new EmployeeNameComparator(); (Employee e1, Employee e2) -> comp.compare(e1,e2)

 */

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class prob1 {
    public static void main(String[] args) {
        //    A. (Employee e) -> e.getName()
        Function<Employee, String> func = (e) -> e.getName();
        Function<Employee, String> func2 = Employee::getName;

//        B. (Employee e,String s) -> e.setName(s)
        BiConsumer<Employee, String> biConsumer = (employee, name) -> employee.setName(name);
        BiConsumer<Employee, String> biConsumer2 = Employee::setName;
//        C. (String s1,String s2) -> s1.compareTo(s2)
        Comparator<String> comparator = (e1, e2) -> e1.compareTo(e2);
        Comparator<String> comparator2 = String::compareTo;
//        D. (Integer x,Integer y) -> Math.pow(x,y)
        BiFunction<Integer, Integer, Double> biFunction = (x, y) -> Math.pow(x, y);
        BiFunction<Double, Double, Double> biFunction2 = Math::pow;

//        E. (Apple a) -> a.getWeight()
        Function<Apple, Double> funca1 = (apple) -> apple.getWeight();
        Function<Apple, Double> funca12 = Apple::getWeight;
//        F. (String x) -> Integer.parseInt(x);
        Function<String, Integer> func22 = (strNumber)-> Integer.parseInt(strNumber);
        Function<String, Integer> func23 = Integer::parseInt;

    }
    class Employee{
        String name;
        public String getName(){
            return "name";
        }
        public void setName(String name){
            this.name = name;
        }
    }
    class Apple {
        double weight;

        public double getWeight(){
            return weight;
        }
    }
}
