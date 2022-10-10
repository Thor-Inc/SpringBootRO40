package pl.sdacademy.SpringBootRO40;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootRo40Application {

	public static void main(String[] args) {
		ApplicationContext ctx  =SpringApplication.run(SpringBootRo40Application.class, args);
		List<String> beanList = Arrays.asList(ctx.getBeanDefinitionNames());
		beanList.forEach(bean -> System.out.println(bean));
	}
}
