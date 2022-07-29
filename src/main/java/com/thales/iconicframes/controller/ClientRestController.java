package com.thales.iconicframes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.thales.iconicframes.model.Client;
import com.thales.iconicframes.repo.ClientRepository;


@RestController
@RequestMapping("/client")
public class ClientRestController {

	@Autowired
	private ClientRepository clientRepository;

	@CrossOrigin(origins = "*")
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@CrossOrigin(origins = "*")
	@GetMapping("")
	public List<Client> findall() {
		return clientRepository.findAll();
	}

	@CrossOrigin(origins = "*")
	@GetMapping("{email}")
	public Client finbyid(@PathVariable(name = "email") String email) {
		return clientRepository.findById(email).get();
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/registration")
	public ResponseEntity<Client> registerClient(@RequestBody Client client) {

		return ResponseEntity.ok(clientRepository.save(client));
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("{email}")
	public void delete(@PathVariable(name = "email") String email) {
		clientRepository.delete(clientRepository.findById(email).get());

	}

	@CrossOrigin(origins = "*")
	@PutMapping("/update")
	public void update(@RequestBody Client c) {
		clientRepository.save(c);
	}

	@CrossOrigin
	@GetMapping("/login/{email}/{pass}")
	public Client findByMailAndPass(@PathVariable(name = "email") String email,
			@PathVariable(name = "pass") String pass) {
		Client c = clientRepository.findByEmailAndPassword(email, pass);
		return c;

	}
}