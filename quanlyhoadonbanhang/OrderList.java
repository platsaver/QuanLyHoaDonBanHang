package quanlyhoadonbanhang;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private List<Order> orders;
    public OrderList() {
        this.orders = new ArrayList<>();
    }
    public void add(Order order) {
        orders.add(order);
    }
    public int getCount() {
        return orders.size();
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void remove(Order order) {
        orders.remove(order);
    }
}
