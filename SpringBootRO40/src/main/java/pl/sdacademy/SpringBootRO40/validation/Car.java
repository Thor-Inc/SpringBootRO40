package pl.sdacademy.SpringBootRO40.validation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @NotNull
    @UniqueElements
    private long id;

    @Length(max = 3)
    private String carBrand;
    private String color;


    private int horsePower;

    @Min(4)
    private int wheels;

    @Max(5)
    private int maxSeatNumber;
}
