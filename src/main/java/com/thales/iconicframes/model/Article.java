package com.thales.iconicframes.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "articles")
public class Article {

	@Id
	private String reference;

	private String nom;
	private String marque;
	private String description;

	@ManyToOne
	@JsonIgnoreProperties("articles")
	private Categorie categorie;

	private Date date;

	@Lob
	@Column(name = "image")
	private byte[] image;

	private double prix;

	@Version
	private int version;

	public Article() {
		super();
	}

	public Article(String reference, String nom, String marque, String description, Categorie categorie, Date date,
			double prix) {
		super();
		this.reference = reference;
		this.nom = nom;
		this.marque = marque;
		this.description = description;
		this.categorie = categorie;
		this.date = date;
		this.prix = prix;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}