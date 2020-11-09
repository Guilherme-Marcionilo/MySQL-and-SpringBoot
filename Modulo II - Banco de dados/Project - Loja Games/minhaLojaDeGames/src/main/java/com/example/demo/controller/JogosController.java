package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import com.example.demo.model.Jogos;
import com.example.demo.repository.JogosRepository;

@RestController
@RequestMapping("/jogos")
public class JogosController {

	@Autowired
	private JogosRepository repository;
	
	// Crud
	@GetMapping
	public List<Jogos> findAllProduto() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Jogos> findByIDProduto(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@GetMapping("/{nome}/{descricao}")
	public Optional<Jogos> findByDescricaoTitulo(@PathVariable String titulo,@PathVariable String descricao) {
		return repository.findByTituloAndDescricao(titulo,descricao);
	}
	
	@PostMapping
	public Jogos postProduto(@RequestBody Jogos objetoJogos) {
		repository.save(objetoJogos);
		return objetoJogos;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Jogos> putProduto(@RequestBody Jogos objetoJogos){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(objetoJogos));
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable long id) {
		repository.deleteById(id);
	}	
	
	
}
