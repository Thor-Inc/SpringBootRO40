package pl.sdacademy.SpringBootRO40.security.csrf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoneyTransferForm {

    private String name;
    private String iban;
    private String amount;
}
