package com.example.coursework2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionException extends IllegalArgumentException {

    public static final String DEFAULT_MESSAGE = "More questions were requested than are stored in the service ";

    public QuestionException() {
        super(DEFAULT_MESSAGE);
    }
}
