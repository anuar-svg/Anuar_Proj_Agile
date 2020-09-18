package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Школа с таким наименованием не найден")
public class SchoolNotFoundException extends RuntimeException {
    
	public SchoolNotFoundException() {
        super();
    }

}