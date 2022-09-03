package com.mvn.exception;

/**
 * Created by e1hax on 2022-09-02.
 */
public class SystemException extends RuntimeException {

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public SystemException(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;

    }
}
