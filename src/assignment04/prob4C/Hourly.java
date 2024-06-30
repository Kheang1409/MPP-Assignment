package assignment04.prob4C;

public class Hourly extends Employee{
    private double hourlyWage;
    private double hoursPerWeek;

    protected Hourly(String empId) {
        super(empId);
    }

    public double calcGrossPay(int month, int year){
        int duration = month + year*12;
        return hourlyWage * hoursPerWeek * duration;
    }
}
