package br.edu.fatecfranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.User;
import br.edu.fatecfranca.repositories.UserRepository;

@RestController
public class UserController {
	
	// injeção de dependencia
	@Autowired
	UserRepository injecao;
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping("/user/login/{email}")
	public User getUserPorEmail(@PathVariable String email) {
		//retorna o usuário com o email informado
		return injecao.findByEmail(email);
	}
     
}
