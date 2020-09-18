package com.example.iasback.models;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

//@Data
public class Dictionary {
    private Integer id;
    private String data;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
    
}
