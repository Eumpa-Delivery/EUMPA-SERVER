package com.eumpa.delivery.error.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ChatErrorCode {
    ChatRoomNotFound(HttpStatus.BAD_REQUEST, "존재하지 않는 채팅방입니다.");

    private final HttpStatus statusCode;
    private final String errorMessage;
}
