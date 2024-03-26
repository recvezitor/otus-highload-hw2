package com.dimas.exception;

public class ApiBaseException extends RuntimeException {

    public ApiBaseException() {
    }

    public ApiBaseException(String message) {
        super(message);
    }

    public ApiBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiBaseException(Throwable cause) {
        super(cause);
    }

    public ApiBaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
