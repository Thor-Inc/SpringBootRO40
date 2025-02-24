package pl.sda.ristoretoCoffeeShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.ristoretoCoffeeShop.service.OrderService;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getAllOrders")
    public String getAllOrders(final ModelMap modelMap) {
        orderService.getAllOrders().forEach(System.out::println);
        modelMap.addAttribute("orders", orderService.getAllOrders());
        return "getOrders";
    }

}
