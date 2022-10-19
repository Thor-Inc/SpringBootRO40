package pl.sdacademy.SpringBootRO40.security.csrf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
@Controller
public class TransferMoneyController {

    @GetMapping("/transferMoney")
    public String showOrderForm(final ModelMap modelMap) {
        modelMap.addAttribute("transferForm", new MoneyTransferForm());
        return "transferMoney";
    }

    @PostMapping("/transferMoney")
    public String handleNewOrder(@Valid @ModelAttribute("transferForm") final MoneyTransferForm transferForm, final Errors errors) {

        return "transferMoney";

    }
}