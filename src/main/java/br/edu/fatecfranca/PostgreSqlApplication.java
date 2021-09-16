package br.edu.fatecfranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fatecfranca.model.Comment;
import br.edu.fatecfranca.model.Post;
import br.edu.fatecfranca.model.User;
import br.edu.fatecfranca.repositories.PostRepository;
import br.edu.fatecfranca.repositories.UserRepository;

// esta nossa classe vai executar e mostrar no console do servidor
@SpringBootApplication
public class PostgreSqlApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PostgreSqlApplication.class, args);
	}
    
	@Autowired // injeção de dependência
	PostRepository injecao;
	
	@Autowired
	UserRepository injecaoUser;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// criando um post
		Post post = new Post("Aula de JPA", "Bruno", "JPA é um ORM");
		// criando 3 comentários
		Comment comentario1 = new Comment("Airlene", "ORM - Object Relational Mapping");
		Comment comentario2 = new Comment("Samara", "JPA e ORM aumentam empregabilidade");
		Comment comentario3 = new Comment("Luis Gustavo", "Aumentam salário também");
        // insere os comentários no post
		post.getComments().add(comentario1);
		post.getComments().add(comentario2);
		post.getComments().add(comentario3);
		
		// insere o post no banco de dados PostgreSQL
		// automaticamente insere os comentários no banco de dados PostgreSQL
		this.injecao.save(post);
		
		// insere usuário
		//User usu1 = new User("teste@gmail.com", "123", "Teste", "Franca");
				//this.injecaoUser.save(usu1);
		
		System.out.println("Vai aparecer este texto no console");
		
	}

}
