package com.example.iasback.models;

import lombok.Data;


//@Data
public class Role {
	private Integer id;
	private ERole name;
//	private String role_name_kz;
//	private String role_name_ru;
//	private String role_name_en;


	public Role() {

	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public ERole getName() {
		return name;
	}


	public void setName(ERole name) {
		this.name = name;
	}

}
