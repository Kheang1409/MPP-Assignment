package assignment04.prob4C;

import java.time.LocalDate;
import java.util.ArrayList;

public class Commissioned extends Employee{
    private double commission;
    private double baseSalary;
    ArrayList<Order> orders = new ArrayList<>();

    public Commissioned(String empId, double commission, double baseSalary){
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
    }
    public Commissioned(String empId, double commission, double baseSalary, ArrayList<Order> orders){
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }

    public void addNewOrder(int orderNo, LocalDate orderDate, double orderAmount){
        orders.add(new Order(orderNo, orderDate, orderAmount));
    }

    public double calcGrossPay(int month, int year){
        double total =0;

        for(Order order : orders){
            if(order.getOrderDate().getMonthValue()==month && order.getOrderDate().getYear() == year )
                total+=order.getOrderAmount();
        }
        return baseSalary + commission * total;
    }
}
