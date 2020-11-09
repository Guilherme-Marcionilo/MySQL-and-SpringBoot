package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Jogos;

public interface JogosRepository extends JpaRepository<Jogos, Long> {

	Optional<Jogos> findByTituloAndDescricao(String titulo, String descricao);

}
