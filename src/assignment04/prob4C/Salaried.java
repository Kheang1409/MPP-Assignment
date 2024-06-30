package assignment04.prob4C;

public class Salaried extends Employee{
    private double salary;
    public double calcGrossPay(int month, int year){
        int duration =  month + year*12;
        return salary * duration;
    }
    public Salaried(String emp){
        super(emp);
    }
}
