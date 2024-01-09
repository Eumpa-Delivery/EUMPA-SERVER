package com.eumpa.delivery.error.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum AuthErrorCode {
    AlreadyExistUserEmail(HttpStatus.BAD_REQUEST, "이미 존재하는 사용자 이메일입니다."),
    EmailAuthNotYet(HttpStatus.BAD_REQUEST, "이메일 인증을 먼저 해주세요."),
    AuthKeyNotMatch(HttpStatus.CONFLICT, "인증 코드가 맞지 않습니다."),
    EmailNotMatched(HttpStatus.BAD_REQUEST, "이메일이 정확하지 않습니다."),
    PasswordNotEqual(HttpStatus.BAD_REQUEST, "비밀번호가 일치하지 않습니다."),
    MemberNotFound(HttpStatus.BAD_REQUEST, "존재하지 않는 회원입니다."),
    NotValidToken(HttpStatus.BAD_REQUEST, "유효하지 않은 토큰입니다.");

    private final HttpStatus statusCode;
    private final String errorMessage;
}
