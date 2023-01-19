//package com.example.firstproject.exception;
//
//
////'@ExceptionHandler를 이용한 예외 처리'
////https://urclass.codestates.com/content/4bfb9f07-9f54-407d-ba1e-630c9e52085c?playlist=2248
////https://github.com/codestates-seb/seb39_main_006/blob/main/server/src/main/java/com/codestates/seb006main/exception/ErrorResponse.java
//
////레퍼코드
////https://github.com/codestates-seb/seb40_pre_011/blob/main/server/src/main/java/Singleton/server/response/ErrorResponse.java
////https://github.com/codestates-seb/seb39_main_051/blob/main/server/main/src/main/java/com/codestates/main/response/ErrorResponse.java
//
//import lombok.Getter;
//import org.springframework.http.HttpStatus;
//import org.springframework.validation.BindingResult;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Getter
//public class ErrorResponse {
//    private int status;
//    private String message;
//    private List<FieldError> fieldErrors;
//    private List<ConstraintViolationError> violationErrors;
//
//    private ErrorResponse(int status, String message) {
//        this.status = status;
//        this.message = message;
//    }
//
//    private ErrorResponse(final List<FieldError> fieldErrors,
//                          final List<ConstraintViolationError> violationErrors) {
//        this.fieldErrors = fieldErrors;
//        this.violationErrors = violationErrors;
//    }
//
//    public static ErrorResponse of(BindingResult bindingResult) {
//            return new ErrorResponse(FieldError.of(bindingResult), null);
//}
//
//    public static ErrorResponse of(Set<ConstraintViolation<?>> violations) {
//        return new ErrorResponse(null, ConstraintViolationError.of(violations));
//    }
//
//    public static ErrorResponse of(ExceptionCode exceptionCode) {
//        return new ErrorResponse(exceptionCode.getStatus(), exceptionCode.getMessage());
//    }
//
//    public static ErrorResponse of(HttpStatus httpStatus) {
//        return new ErrorResponse(httpStatus.value(), httpStatus.getReasonPhrase());
//    }
//
//    public static ErrorResponse of(HttpStatus httpStatus, String message) {
//        return new ErrorResponse(httpStatus.value(), message);
//    }
//
//@Getter
//public static class FieldError {
//    private String field;
//    private Object rejectedValue;
//    private String reason;
//
//    private FieldError(String field, Object rejectedValue, String reason) {
//        this.field = field;
//        this.rejectedValue = rejectedValue;
//        this.reason = reason;
//    }
//
//    public static List<FieldError> of(BindingResult bindingResult) {
//        final List<org.springframework.validation.FieldError> fieldErrors =
//                bindingResult.getFieldErrors();
//        return fieldErrors.stream()
//                .map(error -> new FieldError(
//                        error.getField(),
//                        error.getRejectedValue() == null ?
//                                "" : error.getRejectedValue().toString(),
//                        error.getDefaultMessage()))
//                .collect(Collectors.toList());
//    }
//}
//
//@Getter
//public static class ConstraintViolationError {
//    private String propertyPath;
//    private Object rejectedValue;
//    private String reason;
//
//    private ConstraintViolationError(String propertyPath, Object rejectedValue,
//                                     String reason) {
//        this.propertyPath = propertyPath;
//        this.rejectedValue = rejectedValue;
//        this.reason = reason;
//    }
//
//    public static List<ConstraintViolationError> of(
//            Set<ConstraintViolation<?>> constraintViolations) {
//        return constraintViolations.stream()
//                .map(constraintViolation -> new ConstraintViolationError(
//                        constraintViolation.getPropertyPath().toString(),
//                        constraintViolation.getInvalidValue().toString(),
//                        constraintViolation.getMessage()
//                )).collect(Collectors.toList());
//    }
//}
//}