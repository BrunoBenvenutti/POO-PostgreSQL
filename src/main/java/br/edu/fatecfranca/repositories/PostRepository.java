package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatecfranca.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
