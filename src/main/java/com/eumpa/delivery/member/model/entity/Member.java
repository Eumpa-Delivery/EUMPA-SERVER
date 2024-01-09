package com.eumpa.delivery.member.model.entity;

import com.eumpa.delivery.member.model.type.EmailAuthStatus;
import com.eumpa.delivery.member.model.dto.JoinReqDTO;
import com.eumpa.delivery.member.model.type.MemberRole;
import com.eumpa.delivery.member.model.type.MemberStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @NotNull
    private String name;

    @NotNull
    private String nickName;

    @NotNull
    private String email;

    @NotNull
    private String password;

    private String address;

    private LocalDateTime regDt;

    private LocalDateTime emailAuthDt;

    private String emailAuthKey;

    @Enumerated(EnumType.STRING)
    private EmailAuthStatus emailAuthStatus;

    @Enumerated(EnumType.STRING)
    private MemberRole role;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    public static Member of(JoinReqDTO.Request JoinReqDTO) {
        Member member = Member.builder()
                .email(JoinReqDTO.getEmail())
                .name(JoinReqDTO.getName())
                .password(JoinReqDTO.getPassword())
                .status(MemberStatus.SUSPENDED)
                .regDt(LocalDateTime.now())
                .emailAuthStatus(EmailAuthStatus.PENDING)
                .role(MemberRole.ROLE_USER)
                .build();
        return member;
    }
}