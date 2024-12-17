package quanlyhoadonbanhang;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer; 
    private List<OrderLine> orderLines;  //Quan hệ 1-N 
    private Currency total; 

    public Order(Customer customer){
        this.customer = customer;
        this.orderLines = new ArrayList<>(); 
        this.total = new Currency(0); 
    }
    public OrderLine addLine(OrderLine orderLine){
        orderLines.add(orderLine); 
        total.add(orderLine.getValue());
        return orderLine; 
    }
    public void removeLine(OrderLine orderLine){
        orderLines.remove(orderLine);
        recalculateTotal();
    }
    private void recalculateTotal(){
        total = new Currency(0);
        for (OrderLine line:orderLines){
            total.add(line.getValue());
        }
    }
    //Getter, setter
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer; 
    }
    public List<OrderLine> getOrderLines(){
        return orderLines; 
    }
    public void setOrderLines(List<OrderLine> orderLines){
        this.orderLines = new ArrayList<>();
        recalculateTotal();
    }
    public Currency getTotal(){
        return total; 
    }
}
