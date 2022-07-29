package com.thales.iconicframes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thales.iconicframes.model.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {

}