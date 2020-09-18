package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Сельский округ не найден")
public class DistrictNotFoundException extends RuntimeException {
    
	public DistrictNotFoundException() {
        super();
    }

}