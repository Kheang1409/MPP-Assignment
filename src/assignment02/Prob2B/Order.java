package Prob2B;

public class Order {
    private int orderNum;
    private OrderLine orderLine;

    public Order(int orderNum){
        this.orderNum = orderNum;
        orderLine = new OrderLine(this);
    }
    public int getOrderNum() {
        return orderNum;
    }
    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
    @Override
    public String toString() {
        return STR."Order [orderNum=\{orderNum}, orderLine=\{orderLine}]";
    }
}
