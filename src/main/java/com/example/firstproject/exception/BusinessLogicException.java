package com.example.firstproject.exception;

import lombok.Getter;


//https://urclass.codestates.com/content/29e321b8-212e-416e-b42c-78a29eb4c8f6?playlist=2248
public class BusinessLogicException extends RuntimeException{

    @Getter
    private ExceptionCode exceptionCode;

    public BusinessLogicException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.exceptionCode = exceptionCode;
    }

}
