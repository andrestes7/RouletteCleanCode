package com.masivianTest.roulettetest.Exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.CONFLICT)
public class ProblemException extends RuntimeException {
    public ProblemException(String message) {
        super(message);
    }
}
