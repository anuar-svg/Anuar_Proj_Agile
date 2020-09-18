package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Учреждения ТиПо с таким наименованием не найден")
public class CollegeNotFoundException extends RuntimeException {
    
	public CollegeNotFoundException() {
        super();
    }

}