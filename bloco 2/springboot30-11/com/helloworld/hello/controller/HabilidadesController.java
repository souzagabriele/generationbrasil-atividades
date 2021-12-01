package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
	@GetMapping()
	public String habilidades() {
		return "Habilidades e mentalidades: " +
			 "Utilizei a mentalidade de Persistência e a habilidade de Atenção aos Detalhes.";
				
	}
}