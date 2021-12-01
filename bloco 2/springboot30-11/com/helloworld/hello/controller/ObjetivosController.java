package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")
public class ObjetivosController {
	
	@GetMapping()
	public String objetivos() {
		return "Para realizar esta atividade usei a habilidade de atenção aos detalhes e e proatividade."
				+ "E as mentalidades de persistência e mentalidade de crescimento.";
	}

}
