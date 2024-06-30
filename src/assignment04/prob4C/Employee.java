package assignment04.prob4C;

public abstract class Employee {
    private String empId;
    public void print(){

    }
    protected Employee(String empId){
        this.empId = empId;
    }
    public Paycheck calcCompensation(int month, int year){
        if(month < 1 || month > 12){
            throw new IllegalArgumentException("Invalid month");
        }

        return new Paycheck(calcGrossPay(month, year));
    }
    public abstract double calcGrossPay(int month, int year);
}
