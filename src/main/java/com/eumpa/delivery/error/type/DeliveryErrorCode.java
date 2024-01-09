package com.eumpa.delivery.error.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum DeliveryErrorCode {
    DeliveryNotFound(HttpStatus.BAD_REQUEST, "존재하지 않는 배달 모집글입니다.");

    private final HttpStatus statusCode;
    private final String errorMessage;
}
