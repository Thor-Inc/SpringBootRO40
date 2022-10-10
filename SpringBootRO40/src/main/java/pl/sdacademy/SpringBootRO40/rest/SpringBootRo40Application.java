package pl.sdacademy.SpringBootRO40.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@ComponentScan("pl.sdacademy.SpringBootRO40.rest;")
public class SpringBootRo40Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRo40Application.class, args);
	}
}
