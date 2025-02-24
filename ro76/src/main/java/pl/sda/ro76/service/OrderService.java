package pl.sda.ro76.service;

import org.springframework.stereotype.Service;
import pl.sda.ro76.model.Order;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    List<Order> orderList = new ArrayList<>();
    int id = 0;

    public void addOrder(Order order) {
        order.setId(id);
        order.setDate(new Date());
        order.setPaymentMethod("CARD");
        orderList.add(order);
        id++;
    }

    public List<Order> getAllOrders() {
        return orderList;
    }

    public List<Order> filterOrdersByStatus(String status) {
        if(status == null || status.isBlank()) {
            return new ArrayList<>();
        }
        return orderList.stream().filter(s -> s.getStatus().equals(status)).collect(Collectors.toList());
    }

}