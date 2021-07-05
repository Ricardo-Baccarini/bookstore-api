package com.ricardo.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardo.bookstore.domain.Livro;
import com.ricardo.bookstore.repositories.LivroRepository;
import com.ricardo.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {
	@Autowired
	private LivroRepository repository;

	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto livro não encontrado! Id " + id + ", Tipo " + Livro.class.getName()));
	}

}
