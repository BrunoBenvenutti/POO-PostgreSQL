package br.edu.fatecfranca.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="paciente")
public class Paciente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4278956629458298029L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; // chave gerada e incrementada automaticamente

	private String nome;
	private int idade;
	private float altura;
	
	public Paciente() {
		
	}
	
	public Paciente(Long id, String nome, int idade, float altura) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	

}
