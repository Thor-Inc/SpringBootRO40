package pl.sdacademy.SpringBootRO40.validation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @NotNull(message = "missing name")
    @Length(min = 3, max = 45, message = "Name must have length  between 3 and 45 characters")
    private String name;

    @NotNull
    private String address;

    @Email
    private String email;
}
