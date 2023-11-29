package com.senac.sistemacoleta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "Prova de Nivelamento", version = "2.0", description = "Prova"))
@SpringBootApplication
public class SistemaColetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaColetaApplication.class, args);
	}

}
