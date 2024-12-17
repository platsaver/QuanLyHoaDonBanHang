package quanlyhoadonbanhang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner object = new Scanner (System.in); 
        OrderList orderList = new OrderList();
        while (true){
            System.out.println("Tạo một đơn hàng mới (yes/no): "); 
            String opt = object.nextLine();
            if (opt=="no"){
                break; 
            }
            System.out.println("Nhập thông tin khách hàng: ");
            System.out.println("Tên khách hàng: "); 
            String name = object.nextLine(); 
            System.out.println("Mã khách hàng: "); 
            String code = object.nextLine(); 
            System.out.println("Địa chỉ khách hàng: ");
            String address = object.nextLine();
            Customer customer = new Customer(address, code, name);
            Order order = new Order(customer);
            while (true){
                System.out.println("Giá trị của đơn hàng: "); 
                int value = object.nextInt();
                object.nextLine(); 
                OrderLine orderLine = new OrderLine(new Currency(value));
                order.addLine(orderLine);
                System.out.println("Thêm một OrderLine nữa (yes/ no)?"); 
                String opt1 = object.nextLine(); 
                if (opt1 == "no"){
                    break; 
                }
            }
            orderList.add(order);
            String opt2 = object.nextLine(); 
            if (opt2=="no"){
                break; 
            }
        }
        object.close();
        for (Order order: orderList.getOrders()){
            System.out.println("Khách hàng: "+order.getCustomer().getName()); 
            System.out.println("Địa chỉ: "+order.getCustomer().getAddress()); 
            System.out.println("Mã khách hàng: "+order.getCustomer().getCode());
            for (OrderLine orderLine: order.getOrderLines()){
                System.out.println(" OrderLine Value: " + orderLine.getValue().getValue());
            } 
        }
    }
}
