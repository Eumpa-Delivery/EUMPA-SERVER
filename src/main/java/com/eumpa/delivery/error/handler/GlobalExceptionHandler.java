package com.eumpa.delivery.error.handler;

import com.eumpa.delivery.error.exception.AuthException;
import com.eumpa.delivery.error.exception.ChatException;
import com.eumpa.delivery.error.exception.DeliveryException;
import com.eumpa.delivery.error.response.GlobalErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AuthException.class)
    protected ResponseEntity<GlobalErrorResponse> handleAuthExceptionHandler(AuthException exception) {
        return ResponseEntity
                .status(exception.getErrorCode().getStatusCode())
                .body(GlobalErrorResponse.from(exception.getErrorCode().getErrorMessage()));
    }

    @ExceptionHandler(DeliveryException.class)
    protected ResponseEntity<GlobalErrorResponse> handleDeliveryExceptionHandler(DeliveryException exception) {
        return ResponseEntity
                .status(exception.getErrorCode().getStatusCode())
                .body(GlobalErrorResponse.from(exception.getErrorCode().getErrorMessage()));
    }

    @ExceptionHandler(ChatException.class)
    protected ResponseEntity<GlobalErrorResponse> handleChatExceptionHandler(ChatException exception) {
        return ResponseEntity
                .status(exception.getErrorCode().getStatusCode())
                .body(GlobalErrorResponse.from(exception.getErrorCode().getErrorMessage()));
    }
}
