package com.thales.iconicframes.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.thales.iconicframes.repo.ClientRepository;

@Service
public class ConsoleService implements CommandLineRunner {

	@Autowired
	private ClientRepository crepo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bienvenue");
		System.out.println(crepo.findAll());
	}

}
