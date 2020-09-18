package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Статистики за данный год не существует")
public class YearNotFoundException extends RuntimeException {
    
	public YearNotFoundException() {
        super();
    }

}