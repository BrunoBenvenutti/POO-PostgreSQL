package br.edu.fatecfranca.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8061651363583680611L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String author;
	private String description;
	
	//composição
	// all inserir o post, insere-se os comentários
	@OneToMany(cascade = CascadeType.ALL)
	// coluna na tabela Comment - chave estrangeira na classe Comment
	@JoinColumn(name="id_post", referencedColumnName = "id")
	private List<Comment> comments = new ArrayList<>(); // guarda os comentários do Post
	
	public Post() {
		
	}
	
	public Post(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
