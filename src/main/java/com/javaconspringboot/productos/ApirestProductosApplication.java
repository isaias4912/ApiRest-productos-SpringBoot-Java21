package com.javaconspringboot.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//con restcontroller nos avisa que vamos a usar un endpoint para exponerlo
@RestController
public class ApirestProductosApplication {


	public static void main(String[] args) {
		SpringApplication.run(ApirestProductosApplication.class, args);
	}

	 //@GetMapping
	 //get mapping(endpoint)se encarga de manejar la solicitud  que recibe del servidor o una URL
	// public String hello(){
		//return "hola isaias";
	 //}
}
