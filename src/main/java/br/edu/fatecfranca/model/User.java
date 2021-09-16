package br.edu.fatecfranca.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9173615588465340183L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	private String senha;
	private String nome;
	private String endereco;
	
	public User() {
		
	}
	
	
	public User(String email, String senha, String nome, String endereco) {

		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.endereco = endereco;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if (senha.contains("@")) {
		this.senha = senha;
		}
		else {
			System.out.println("Erro no email");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
