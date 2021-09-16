package br.edu.fatecfranca.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="medico")
public class Medico implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5453578393222450169L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // chave gerada e incrementada automaticamente

	private String nome;
	private int crm;
	private String especialidade;
	private boolean cirurgiao;
	
	public Medico() {
		
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

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public boolean isCirurgiao() {
		return cirurgiao;
	}

	public void setCirurgiao(boolean cirurgiao) {
		this.cirurgiao = cirurgiao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
	
	
	
	

	