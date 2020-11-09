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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;

@RestController
public class CategoriaController implements WebMvcConfigurer{
	
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}
	
	@Autowired
	private CategoriaRepository repository;
	
	// Crud
	@GetMapping("/categorias")
	public List<Categoria> findAllCategoria() {
		return repository.findAll();
	}
	
	@GetMapping("/categorias/{id}")
	public Optional<Categoria> findByIDCategoria(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@GetMapping("/categorias/{nome}/{descricao}")
	public Optional<Categoria> findByDescricaoCategoria (@PathVariable String nome,@PathVariable String descricao) {
		return repository.findByDescricaoAndCategoria(nome,descricao);
	}
	
	@PostMapping("/categoria")
	public Categoria postCategoria (@RequestBody Categoria objetoCategoria) {
		repository.save(objetoCategoria);
		return objetoCategoria;
	}
	
	@PutMapping
	public ResponseEntity<Categoria> putCategoria(@RequestBody Categoria objetoCategoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(objetoCategoria));
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable long id) {
		repository.deleteById(id);
	}	
	
	
			
}
