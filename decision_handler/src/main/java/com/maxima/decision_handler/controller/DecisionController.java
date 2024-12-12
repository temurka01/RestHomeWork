package com.maxima.decision_handler.controller;

import com.maxima.decision_handler.dto.RequestOnCreditDto;
import com.maxima.decision_handler.service.DecisionService;
import com.maxima.decision_handler.service.DecisionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decision")
public class DecisionController {
    private final DecisionService decisionService;

    @Autowired
    public DecisionController(DecisionService decisionService) {
        this.decisionService = decisionService;
    }

    @PostMapping
    public ResponseEntity<RequestOnCreditDto> makeDecision(@RequestBody RequestOnCreditDto info) {
        return decisionService.makeDecision(info);
    }
}
