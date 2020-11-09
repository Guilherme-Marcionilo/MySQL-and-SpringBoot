package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_jogos")
public class Jogos {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@NotNull
	private String titulo;
	
	@Column
	@NotNull
	private String nome;
	
	@Column
	@NotNull
	private String produto;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "descricao", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("descricao")
	private List<Jogos> categoria;
	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Jogos> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Jogos> categoria) {
		this.categoria = categoria;
	}

	

	
}
