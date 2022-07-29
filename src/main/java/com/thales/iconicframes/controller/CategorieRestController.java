package com.thales.iconicframes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thales.iconicframes.model.Categorie;
import com.thales.iconicframes.repo.CategorieRepository;

@RestController
@RequestMapping("/categorie")
public class CategorieRestController {

	@Autowired
	private CategorieRepository categorieRepository;

	@CrossOrigin(origins = "*")
	@GetMapping("/test")
	public String hello() {
		return "hello";
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/findall")
	public List<Categorie> findall() {
		return categorieRepository.findAll();
	}

	@CrossOrigin(origins = "*")
	@GetMapping("{id}")
	public Categorie finbyid(@PathVariable(name = "id") int id) {
		return categorieRepository.findById(id).get();
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/registration")
	public String create(@RequestBody Categorie c) {
		categorieRepository.save(c);
		return "ok";
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("{id}")
	public void delete(@PathVariable(name = "id") int id) {
		categorieRepository.delete(categorieRepository.findById(id).get());
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/update")
	public void update(@RequestBody Categorie c) {
		categorieRepository.save(c);
	}
}
