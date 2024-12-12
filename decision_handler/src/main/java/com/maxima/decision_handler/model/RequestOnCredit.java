package com.maxima.decision_handler.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Заявка на кредит
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestOnCredit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private ClientInfo clientInfo;

    @OneToOne
    private LoanDecision loanDecision;
}
