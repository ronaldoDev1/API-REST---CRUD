package com.api.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {

	void deleteById(Long id);

	@SuppressWarnings("unchecked")
	Biblioteca save(Biblioteca biblioteca);

	Optional<Biblioteca> findById(Long id);

	List<Biblioteca> findAll();



}
