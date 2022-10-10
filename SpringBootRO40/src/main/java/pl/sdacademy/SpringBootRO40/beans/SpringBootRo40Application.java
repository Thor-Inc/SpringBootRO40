package pl.sdacademy.SpringBootRO40.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootRo40Application {

	public static void main(String[] args) {
		ApplicationContext ctx  =SpringApplication.run(SpringBootRo40Application.class, args);
		List<String> beanList = Arrays.asList(ctx.getBeanDefinitionNames());
		beanList.forEach(bean -> System.out.println(bean));

		Owner owner = ctx.getBean(Owner.class);
		System.out.println(owner);
	}

	@Bean
	public MyBean bean() {
		MyBean bean = new MyBean();
		bean.setName("bean1");
		bean.setAge(23);
		return bean;
	}

	@Bean
	public MyBean mybean2() {
		MyBean bean = new MyBean();
		bean.setName("bean1");
		return bean;
	}

	@Bean Cat cat() {
		Cat cat = new Cat();
		cat.setName("Felix");
		return cat;
	}

	@Bean Cat cat2() {
		Cat cat = new Cat();
		cat.setName("Tom");
		return cat;
	}
}
