package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	List<Categoria> findByNome(String nome);
	
	Optional<Categoria> findByDescricaoAndCategoria(String nome, String descricao);

	
	
}

