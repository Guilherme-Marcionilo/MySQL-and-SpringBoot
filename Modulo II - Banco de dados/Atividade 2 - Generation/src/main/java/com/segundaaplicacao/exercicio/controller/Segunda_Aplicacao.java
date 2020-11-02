package com.segundaaplicacao.exercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex")
public class Segunda_Aplicacao {
	
	@GetMapping
	public String hello() {
		return "Eu pretendo absorver ao máximo esse novo conteúdo (Spring Boot)";
	}
	
	
}
