package com.maxima.decision_handler.service;

import com.maxima.decision_handler.dto.RequestOnCreditDto;
import org.springframework.http.ResponseEntity;

public interface DecisionService {
    ResponseEntity<RequestOnCreditDto> makeDecision(RequestOnCreditDto dto);
}
