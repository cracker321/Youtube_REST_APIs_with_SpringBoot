//package com.example.firstproject.exception;
//
//import lombok.Getter;
//
//
////https://urclass.codestates.com/content/29e321b8-212e-416e-b42c-78a29eb4c8f6?playlist=2248
//
//public enum ExceptionCode {
//
//    ARTICLE_NOT_FOUND(404, "Article not found");
//    ARTICLE_TAG_NOT_FOUND(404, "Article not found");
//    ARTICLE_COMMENT_NOT_FOUND(404, "Article comment not found");
//
//    @Getter
//    private int status;
//
//    @Getter
//    private String message;
//
//    ExceptionCode(int code, String message){ //'생성자의 매개변수'로는 '현재 클래스 ExceptionCode'에는 없는 필드인 'int code'가 들어오든,
//                                             //'int abcd'가 들어오든 무엇이 들어오든 상관 없음!
//        this.status = code;
//        this.message = message;
//
//    }
//
//}
