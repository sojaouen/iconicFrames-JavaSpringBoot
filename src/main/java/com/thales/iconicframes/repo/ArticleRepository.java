package com.thales.iconicframes.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.thales.iconicframes.model.Article;

public interface ArticleRepository extends JpaRepository<Article, String> {
	@Query("select a from Article a where a.marque like %:search%")
	public List<Article> findByNom(@Param("search") String search);

	@Query("select a from Article a where categorie_id=:id")
	public List<Article> findByCat(@Param("id") int id);
}