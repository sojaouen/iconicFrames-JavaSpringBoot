package com.thales.iconicframes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thales.iconicframes.model.Commande;
import com.thales.iconicframes.repo.CommandeRepository;


@RestController
@RequestMapping("/commande")
public class CommandeRestController {

	@Autowired
	private CommandeRepository commandeRepository;

	@CrossOrigin(origins = "*")
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@CrossOrigin(origins = "*")
	@GetMapping("")
	public List<Commande> findall() {
		return commandeRepository.findAll();
	}

	@CrossOrigin(origins = "*")
	@GetMapping("{id}")
	public Commande finbyid(@PathVariable(name = "id") int id) {
		return commandeRepository.findById(id).get();
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/create")
	public String create(@RequestBody Commande c) {
		commandeRepository.save(c);
		return "ok";
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("{id}")
	public ResponseEntity<String> delete(@PathVariable(name = "id") int id) {
		commandeRepository.delete(commandeRepository.findById(id).get());
		return new ResponseEntity<String>("Commande supprimmée", HttpStatus.CREATED);
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/update")
	public String update(@RequestBody Commande c) {
		commandeRepository.save(c);
		return "ok";
	}
}

