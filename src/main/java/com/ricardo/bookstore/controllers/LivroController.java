package com.ricardo.bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.bookstore.domain.Categoria;
import com.ricardo.bookstore.domain.Livro;
import com.ricardo.bookstore.service.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {
	
	@Autowired
	LivroService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> findById(@PathVariable Integer id ){
		Livro obj = service.findById(id);
		// Passa no corpo "body" o obj livro
		return ResponseEntity.ok().body(obj);
	}

}
