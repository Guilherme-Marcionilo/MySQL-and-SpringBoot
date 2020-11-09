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
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public List<Usuario> findAllUsuarios() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario> findByIDUsuario(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@PostMapping
	public Usuario postUsuario(@RequestBody Usuario objetoUser) {
		repository.save(objetoUser);
		return objetoUser;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> putUsuario(@RequestBody Usuario objetoUser){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(objetoUser));
	}
	
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable long id) {
		repository.deleteById(id);
	}	
	
	
	
}
