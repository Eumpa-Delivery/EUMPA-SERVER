package com.eumpa.delivery.member.service.impl;

import com.eumpa.delivery.member.model.dto.JoinReqDTO;
import com.eumpa.delivery.member.model.entity.Member;
import com.eumpa.delivery.member.repository.MemberRepository;
import com.eumpa.delivery.member.service.MemberService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void register(JoinReqDTO.Request joinRequest) {
        // 전화번호로 기존 회원을 찾음
        Optional<Member> existingMember = memberRepository.findByPhoneNumber(joinRequest.getEmail());

        if (existingMember.isPresent()) {
            // 이미 회원이 존재하는 경우에 대한 처리
            throw new IllegalArgumentException("이미 가입된 회원입니다."); // 예외 처리 또는 다른 방법으로 처리할 내용을 넣어주세요.
        }

        // 기존 회원이 없으면 새 회원으로 등록
        Member member = Member.of(joinRequest);

        memberRepository.save(member);
    }
}
