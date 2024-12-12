package com.maxima.decision_handler.service;

import com.maxima.decision_handler.dto.RequestOnCreditDto;
import com.maxima.decision_handler.model.LoanDecision;
import com.maxima.decision_handler.repository.LoanDecisionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class DecisionServiceImpl implements DecisionService {
    LoanDecisionRepository loanDecisionRepository;
    @Override
    public ResponseEntity<RequestOnCreditDto> makeDecision(RequestOnCreditDto dto) {

        LoanDecision loanDecision = new LoanDecision();
        loanDecision.setFinalDecision(dto.getClientInfo().getGoodCreditHistory());
        loanDecision.setAmountOfCredit(100000);
        loanDecision.setMonthlyPayment(10000);
        loanDecision = loanDecisionRepository.save(loanDecision);
        dto.setLoanDecision(loanDecision);
        return ResponseEntity.ok(dto);
    }
}
