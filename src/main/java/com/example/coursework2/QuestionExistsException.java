package com.example.coursework2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionExistsException extends RuntimeException {
    public static final String DEFAULT_MESSAGE = "Question is not exist";

    public QuestionExistsException() {
        super(DEFAULT_MESSAGE);
    }
}
