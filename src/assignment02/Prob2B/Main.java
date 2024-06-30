package Prob2B;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(1);
        order.setOrderLine(new OrderLine(order));

        System.out.println(order);
    }
}
