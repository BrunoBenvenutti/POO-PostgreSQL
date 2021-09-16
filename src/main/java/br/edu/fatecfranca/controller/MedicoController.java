package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.Medico;
import br.edu.fatecfranca.repositories.MedicoRepository;

@RestController
public class MedicoController {
	
	// injeção de dependencia
	@Autowired // vamos usar os métodos da interface sem instanciar objetos
	MedicoRepository injecao;
	
	@GetMapping("/medico")
	public List<Medico> get(){
		return injecao.findAll(); // retorna todos os pacientes do banco
	}
	
	@PostMapping("/medico")
	public String add(@RequestBody Medico medico) {
		injecao.save(medico);
		return "Medico salvo com sucesso";
	}
	
	@DeleteMapping("/medico/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Removido com sucesso";
	}
	
	@PutMapping("/medico")
	public String update(@RequestBody Medico medico) {
		injecao.save(medico); // como o paciente já possui id, ele atualiza
		return "Atualizado com sucesso";
	}
	
	
	

}
