package com.example.iasback.models;

import lombok.Data;


//@Data
public class User {
	
	private Integer id;
	private String name;
	private String surname;
	private String patronymic;
	private String username;
	private String email;
	private String password;
	private String iin;
	private Integer role_id;
	private Role role;

	public User() {
	}

	public User(String username, String name, String surname, String patronymic, String email, String password, Integer role_id, String iin) {
		this.username = username;
		this.name=name;
		this.surname=surname;
		this.patronymic=patronymic;
		this.email = email;
		this.password = password;
		this.role_id = role_id;
		this.iin = iin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIin() {
		return iin;
	}

	public void setIin(String iin) {
		this.iin = iin;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
