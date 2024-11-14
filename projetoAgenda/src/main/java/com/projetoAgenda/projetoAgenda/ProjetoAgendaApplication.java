package com.projetoAgenda.projetoAgenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.projetoAgenda.projetoAgenda.elements")
public class ProjetoAgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoAgendaApplication.class, args);
	}

}
