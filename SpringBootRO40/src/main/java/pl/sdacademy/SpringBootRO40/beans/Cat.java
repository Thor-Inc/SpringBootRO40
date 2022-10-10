package pl.sdacademy.SpringBootRO40.beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cat {

    private String name;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
