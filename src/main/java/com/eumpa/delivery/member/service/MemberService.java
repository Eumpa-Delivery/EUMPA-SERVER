package com.eumpa.delivery.member.service;

import com.eumpa.delivery.member.model.dto.JoinReqDTO;

public interface MemberService {
    void register(JoinReqDTO.Request joinRequest);
}
