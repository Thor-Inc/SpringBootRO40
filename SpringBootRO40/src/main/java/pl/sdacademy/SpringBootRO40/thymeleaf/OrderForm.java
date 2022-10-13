package pl.sdacademy.SpringBootRO40.thymeleaf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderForm {
    private String productName;
    private Integer amount;
}
