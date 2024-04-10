package com.api.crud;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BibliotecaController {
	
	BibliotecaRepository repository;
	
	@GetMapping("/biblioteca")
	public List<Biblioteca> getAllBiblioteca(){
		return repository.findAll();
	}
	
	@GetMapping("/biblioteca/{id}")
	public Biblioteca getBibliotecaById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/biblioteca")
	public Biblioteca saveBiblioteca(@RequestBody Biblioteca biblioteca) {
		return repository.save(biblioteca);
	}
	
	@DeleteMapping("/biblioteca/{id}")
	public void deleteBiblioteca(@PathVariable Long id) {
		repository.deleteById(id);
	}
	

	@PutMapping("/biblioteca/{id}")
	public Biblioteca updateBiblioteca(@PathVariable Long id, @RequestBody Biblioteca bibliotecaDetails) {
	    Biblioteca biblioteca = repository.findById(id).orElseThrow(() -> new RuntimeException("Biblioteca não encontrada com o ID: " + id));
	                                     
	    biblioteca.setTitulo(bibliotecaDetails.getTitulo()); 
	    biblioteca.setAutorPrincipal(bibliotecaDetails.getAutorPrincipal()); 

	    return repository.save(biblioteca);
	}


}
