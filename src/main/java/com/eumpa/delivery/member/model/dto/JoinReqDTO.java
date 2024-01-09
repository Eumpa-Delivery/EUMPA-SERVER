package com.eumpa.delivery.member.model.dto;

import lombok.*;

public class JoinReqDTO {
    @Builder
    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Request {
        private String name;
        private String nickName;
        private String email;
        private String password;
        private String address;

    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response {
        private String name;
        private String email;
        private String emailAuthKey;
    }
}
