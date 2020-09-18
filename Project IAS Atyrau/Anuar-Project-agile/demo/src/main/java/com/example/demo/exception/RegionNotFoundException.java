package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Региона не существует")
public class RegionNotFoundException extends RuntimeException {
    
	public RegionNotFoundException() {
        super();
    }

}