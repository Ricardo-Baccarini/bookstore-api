package com.ricardo.bookstore.service;

import java.util.List;
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
	
	@Autowired
	private CategoriaService categoriaService;

	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto livro não encontrado! Id " + id + ", Tipo " + Livro.class.getName()));
	}

	public List<Livro> findAll(Integer id_cat) {
		categoriaService.findById(id_cat);
		return repository.findAllByCategoria(id_cat);
	}

}
