package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloController {
	
	@GetMapping("/hello")
	public String getHello () {
		return "Hello Turma 44";
	}
	@GetMapping("/turma")
	public String getHello2 () {
		return "Turma 44";
	}
	@GetMapping("/objetivo")
	public String getHello3 () {
		return "meu objetivo da semana e ser mais proativo!!!";
	}
	@GetMapping("/bsm_utilizada")
	public String getHello4 () {
		return "Bsm mais utilizada aki foi atenção aos detalhes!!!";
	}
	
	

}
