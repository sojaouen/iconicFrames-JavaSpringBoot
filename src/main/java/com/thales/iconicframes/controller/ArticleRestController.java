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

import com.thales.iconicframes.model.Article;
import com.thales.iconicframes.repo.ArticleRepository;

@RestController
@RequestMapping("/article")
public class ArticleRestController {

	@Autowired
	private ArticleRepository articleRepository;

	@CrossOrigin(origins = "*")
	@GetMapping("/test")
	public String hello() {
		return "hello";
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/findall")
	public List<Article> findall() {
		return articleRepository.findAll();
	}

	@CrossOrigin(origins = "*")
	@GetMapping("{ref}")
	public Article finbyid(@PathVariable(name = "ref") String ref) {
		return articleRepository.findById(ref).get();
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/search/{search}")
	public List<Article> finbynom(@PathVariable(name = "search") String search) {
		return articleRepository.findByNom(search);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/cat/{id}")
	public List<Article> finbycat(@PathVariable(name = "id") int id) {
		return articleRepository.findByCat(id);
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/registration")
	public String create(@RequestBody Article a) {
		articleRepository.save(a);
		return "ok";
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("{ref}")
	public void delete(@PathVariable(name = "ref") String ref) {
		articleRepository.delete(articleRepository.findById(ref).get());
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/update")
	public void update(@RequestBody Article a) {
		articleRepository.save(a);
	}
}