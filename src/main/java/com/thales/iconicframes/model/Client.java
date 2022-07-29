package com.thales.iconicframes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "clients")
public class Client {

	@Id
	@NotNull(message = "L'email ne peut pas etre vide")
	private String email;

	@NotNull(message = "Nom ne peut pas etre vide")
	private String lastname;

	@NotNull(message = "Prenom ne peut pas etre vide")
	private String firstname;

	@Length(min = 3, message = "Il faut au moins 3 caractères")
	private String password;

	@NotNull(message = "Adresse ne peut pas etre vide")
	private String address;

	@NotNull(message = "Ville ne peut pas etre vide")
	private String city;

	@NotNull(message = "Code Postal ne peut pas etre vide")
	private String zipcode;
	private boolean isadmin = false;

	@Lob
	@Column(name = "imageprofile")
	private byte[] imageprofile;

	@Version
	private int version;

	public Client() {
		super();
	}

	public Client(String mail, String lastname, String firstname, String password, String address, String city,
			String zipcode) {
		super();
		this.email = mail;
		this.lastname = lastname;
		this.firstname = firstname;
		this.password = password;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public byte[] getImageprofile() {
		return imageprofile;
	}

	public void setImageprofile(byte[] imageprofile) {
		this.imageprofile = imageprofile;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public boolean isIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}

}