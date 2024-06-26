package com.white.skyprocoursework2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AmountException extends RuntimeException{
    public AmountException() {
        super("Incorrect amount input");
    }
}
