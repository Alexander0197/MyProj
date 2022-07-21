package com.example.MyProj;

import com.example.MyProj.repository.ProductsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjApplication.class, args);
//		ProductsRepository repository = context.getBean(ProductsRepository.class);

	}

}
