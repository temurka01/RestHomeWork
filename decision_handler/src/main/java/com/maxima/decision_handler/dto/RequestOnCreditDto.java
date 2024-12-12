package com.maxima.decision_handler.dto;

import com.maxima.decision_handler.model.ClientInfo;
import com.maxima.decision_handler.model.LoanDecision;
import com.maxima.decision_handler.model.RequestOnCredit;
import lombok.*;

//@Getter
//@Setter
//@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestOnCreditDto {

    private Long id;
    private ClientInfo clientInfo;
    private LoanDecision loanDecision;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public LoanDecision getLoanDecision() {
        return loanDecision;
    }

    public void setLoanDecision(LoanDecision loanDecision) {
        this.loanDecision = loanDecision;
    }
//    public static RequestOnCreditDto fromDto(RequestOnCredit entity) {
//        return RequestOnCreditDto.builder()
//            .clientInfo(entity.getClientInfo())
//            .loanDecision(entity.getLoanDecision())
//            .build();
//    }
}
