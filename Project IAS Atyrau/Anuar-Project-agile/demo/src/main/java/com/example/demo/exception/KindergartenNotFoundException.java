package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Детский сад не найден")
public class KindergartenNotFoundException extends RuntimeException {
    
	public KindergartenNotFoundException() {
        super();
    }

}