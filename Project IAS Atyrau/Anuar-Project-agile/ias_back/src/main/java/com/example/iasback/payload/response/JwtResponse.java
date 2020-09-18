package com.example.iasback.payload.response;

import com.example.iasback.models.Role;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

//@Data
public class JwtResponse implements Serializable {
	private String token;
	private static String type = "Bearer";
	private Integer id;
	private String username;
	private String email;
	private Role role;
	private String name;
	private String surname;
	private String patronymic;

//	public JwtResponse(String accessToken, Integer id, String username, String email, Role role) {
//		this.token = accessToken;
//		this.id = id;
//		this.username = username;
//		this.email = email;
//		this.role = role;
//	}

	public JwtResponse(String token, Integer id, String username, String email, Role role, String name, String surname, String patronymic) {
		this.token = token;
		this.type = type;
		this.id = id;
		this.username = username;
		this.email = email;
		this.role = role;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
	}

	public JwtResponse( Integer id, String username, String email, Role role, String name, String surname, String patronymic) {
		this.type = type;
		this.id = id;
		this.username = username;
		this.email = email;
		this.role = role;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
	}

	public JwtResponse(Integer id, String username, String email, Role role) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		JwtResponse.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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

}
