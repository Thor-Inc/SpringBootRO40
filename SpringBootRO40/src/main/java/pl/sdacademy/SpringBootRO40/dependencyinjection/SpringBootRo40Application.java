package pl.sdacademy.SpringBootRO40.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootRo40Application {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootRo40Application.class, args);
		Person person = ctx.getBean(Person.class);
		String message = person.sayHello("Bob");
		System.out.println(message);
	}
}
