package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
