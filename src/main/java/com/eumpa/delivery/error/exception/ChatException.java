package com.eumpa.delivery.error.exception;

import com.eumpa.delivery.error.type.ChatErrorCode;
import lombok.Getter;

@Getter
public class ChatException extends RuntimeException{
    private final ChatErrorCode errorCode;

    public ChatException(ChatErrorCode errorCode) {
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;
    }
}
