package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.Paciente;
import br.edu.fatecfranca.repositories.PacienteRepository;

@RestController
public class PacienteController {
	
	// injeção de dependencia
	@Autowired // vamos usar os métodos da interface sem instanciar objetos
	PacienteRepository injecao;
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping("/paciente")
	public List<Paciente> get(){
		return injecao.findAll(); // retorna todos os pacientes do banco
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PostMapping("/paciente")
	public String add(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Paciente salvo com sucesso";
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@DeleteMapping("/paciente/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Remoção com sucesso";
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PutMapping("/paciente")
	public String update(@RequestBody Paciente paciente) {
		injecao.save(paciente); // como o paciente já possui id, ele atualiza
		return "Atualizado com sucesso";
	}
	
	
	

}
