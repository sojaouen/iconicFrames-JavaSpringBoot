package com.thales.iconicframes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thales.iconicframes.model.Client;

public interface ClientRepository extends JpaRepository<Client, String> {
	Client findByEmailAndPassword(String email, String password);

}

