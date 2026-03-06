package com.example;

import com.example.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRestFullServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyRestFullServiceApplication.class, args);
		Laptop lp=new Laptop();
	}

}
