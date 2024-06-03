package com.cafeteria.delicias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*Spring genera automaticamente nuestra clase ejecutora o metodo main, al inicio no es necesario realizar
ninguna modificacion */
@SpringBootApplication
public class DeliciasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliciasApplication.class, args);
	}

}
