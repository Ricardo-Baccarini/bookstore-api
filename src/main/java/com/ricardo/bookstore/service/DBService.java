package com.ricardo.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardo.bookstore.domain.Categoria;
import com.ricardo.bookstore.domain.Livro;
import com.ricardo.bookstore.repositories.CategoriaRepository;
import com.ricardo.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	/*
	 * Instancia o banco de dados. Não retorna valor pois o método é void
	 */
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Ficção Científica");
		Categoria cat3 = new Categoria(null, "Biografias", "Livros de biografias");

		Livro l1 = new Livro(null, "Java", "Ze pedro", "Ze pedro java para iniciantes", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Louis va se cata", "sai pra la", cat1);
		Livro l3 = new Livro(null, "A maquina", "Ze pedro", "Motores", cat2);
		Livro l4 = new Livro(null, "Delphi a biblia", "Ja morreu", "Delphi para iniciantes e seniores", cat1);
		Livro l5 = new Livro(null, "Eu robo", "Issac", "Eu como mauqina", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1, l2, l4));
		cat2.getLivros().addAll(Arrays.asList(l3, l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}
}
