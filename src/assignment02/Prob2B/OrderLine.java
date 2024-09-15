package assignment02.Prob2B;

public class OrderLine {
    private Order order;
    public OrderLine(Order order) {
        this.order = order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public Order getOrder(){
        return order;
    }
}
