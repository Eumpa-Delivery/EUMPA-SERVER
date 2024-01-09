package com.eumpa.delivery.member.controller;

import com.eumpa.delivery.member.model.dto.JoinReqDTO;
import com.eumpa.delivery.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String joinPage() {
        return "join"; // Thymeleaf 템플릿 이름 (join.html)
    }

    /**
     * 회원가입
     * @param
     * @return
     * @throws
     */
    @PostMapping("/join")
    @ResponseStatus(HttpStatus.OK)
    public void join(@RequestBody JoinReqDTO.Request joinRequest) throws Exception {
        memberService.register(joinRequest);
    }
}
