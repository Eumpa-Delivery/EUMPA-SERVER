package com.eumpa.delivery.error.exception;

import com.eumpa.delivery.error.type.DeliveryErrorCode;
import lombok.Getter;

@Getter
public class DeliveryException extends RuntimeException {
    private final DeliveryErrorCode errorCode;

    public DeliveryException(DeliveryErrorCode errorCode) {
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;
    }
}
