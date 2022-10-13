package pl.sdacademy.SpringBootRO40.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/error")
    public String showError() {
        return "error";
    }

    @GetMapping("/create")
    public String showOrderForm() {
        return "orders";
    }


    @PostMapping("/create")
    public String handleNewOrder(@ModelAttribute("orderForm") final OrderForm orderForm) {
        // orderForm fields are filled with user values
        // handle new Order here
        return "redirect:/hello";
    }
}