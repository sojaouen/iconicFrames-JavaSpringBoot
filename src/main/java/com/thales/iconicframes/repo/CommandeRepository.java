package com.thales.iconicframes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thales.iconicframes.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {

}