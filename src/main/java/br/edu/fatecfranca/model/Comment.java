package br.edu.fatecfranca.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4849904958333115793L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String text;
	private String author;
	
	public Comment() {
		
	}
	
	public Comment(String author, String text) {
		this.author = author;
		this.text = text;
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
