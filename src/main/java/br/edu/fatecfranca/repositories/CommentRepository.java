package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatecfranca.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{
	

}
