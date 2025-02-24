package pl.sda.ristoretoCoffeeShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.ristoretoCoffeeShop.model.Order;


public interface OrderRepository extends JpaRepository<Order, Integer> {
}
