package pl.sdacademy.SpringBootRO40.ex6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "pl.sdacademy.zad6")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonForm {

    @NotNull(message = "email cannot be null")
    @Email(message = "incorrect email format")
    @Value("pl.sdacademy.zad6.email")
    private String email;

    @Value("pl.sdacademy.zad6.first-name")
    private String firstName;

    @NotNull(message = "age is mandatory")
    @Min(value = 18)
    @Value("pl.sdacademy.zad6.age")
    private String age;

    @NotNull(message = "last name has to be provided")
    @Length(min = 3, max = 20)
    @Value("pl.sdacademy.zad6.last-name")
    private String lastName;

    @Value("pl.sdacademy.zad6.address")
    private String address;

    @NotEmpty(message = "values cannot be empty")
    @Value("pl.sdacademy.zad6.values")
    private List<String> values;

    @NotEmpty(message = "custom attributes cannot be empty")
    @Value("pl.sdacademy.zad6.customAttributes}")
    private Map<String, String> customAttributes;

    @AssertTrue(message = "address is invalid")
    @Value("pl.sdacademy.zad6.first-name")
    public boolean isAddressValid() {
        return address != null && address.split(" ").length == 2;
    }
}
