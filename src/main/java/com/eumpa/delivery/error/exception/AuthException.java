package com.eumpa.delivery.error.exception;

import com.eumpa.delivery.error.type.AuthErrorCode;
import lombok.Getter;

@Getter
public class AuthException extends RuntimeException {
    private final AuthErrorCode errorCode;

    public AuthException(AuthErrorCode errorCode) {
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;
    }
}
