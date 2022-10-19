package pl.sdacademy.SpringBootRO40.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/error")
    public String showError() {
        return "error";
    }

    @GetMapping("/create")
    public String showOrderForm(final ModelMap modelMap) {
        modelMap.addAttribute("orderForm", new OrderForm());
        return "orders";
    }

    @PostMapping("/create")
    public String handleNewOrder(@Valid @ModelAttribute("orderForm") final OrderForm orderForm, final Errors errors) {
        if (errors.hasErrors()) {
            return "orders";

        /*
        Metoda de validare alternativa
        if(validate(orderForm.getAmount())){
            return "redirect:/error";
        }
        */
            // orderForm fields are filled with user values
            // handle new Order here



        }
        return "redirect:/hello";

    }
    private boolean validate(int amount){
        return amount < 5;
    }

}