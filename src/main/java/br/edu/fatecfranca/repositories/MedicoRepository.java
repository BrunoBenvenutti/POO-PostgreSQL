package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{
	
	// esta interface tem todos os métodos de operação com banco de dados PostgreSQL 
	// e considerando a tabela Paciente
}


